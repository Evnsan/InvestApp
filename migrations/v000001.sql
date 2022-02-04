SELECT 'CREATE DATABASE investapp' WHERE NOT EXISTS (
    SELECT FROM pg_database WHERE datname = 'investapp'); \gexec

\c "investapp";

CREATE EXTENSION "uuid-ossp";

CREATE TABLE IF NOT EXISTS "agents" (
  "id" uuid,
  "name" varchar(30),
  PRIMARY KEY ("id")
);

CREATE TABLE IF NOT EXISTS "accounts" (
  "code" varchar(30),
  "agent_id" uuid,
  PRIMARY KEY ("code", "agent_id"),
  CONSTRAINT "FK_accounts.agent_id"
    FOREIGN KEY ("agent_id")
      REFERENCES "agents"("id")
);

CREATE TABLE IF NOT EXISTS "transfers" (
  "id" uuid,
  "timestamp" timestamp,
  "value" numeric(15,3),
  "account_code" varchar(30),
  "account_agent_id" uuid,
  PRIMARY KEY ("id"),
  CONSTRAINT "FK_transfers.account_code_and_agent_id"
    FOREIGN KEY ("account_code", "account_agent_id")
      REFERENCES "accounts"("code", "agent_id")
);

CREATE TABLE IF NOT EXISTS "assets" (
  "id" uuid,
  "title" varchar(50),
  "description" varchar(100),
  PRIMARY KEY ("id")
);

CREATE TABLE IF NOT EXISTS "dealings" (
  "id" uuid,
  "timestamp" timestamp,
  "value" numeric(15,3),
  "account_code" varchar(30),
  "account_agent_id" uuid,
  "asset_id" uuid,
  PRIMARY KEY ("id"),
  CONSTRAINT "FK_dealings.account_code_and_agent_id"
    FOREIGN KEY ("account_code", "account_agent_id")
      REFERENCES "accounts"("code", "agent_id"),
  CONSTRAINT "FK_dealings.asset_id"
    FOREIGN KEY ("asset_id")
      REFERENCES "assets"("id")
);
