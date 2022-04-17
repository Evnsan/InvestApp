import React from "react";
import transferReducer from "../../store/reducers/transferReducer";
import currencyFormater from "../../utils/currencyFormater";
import currencyFormat from "../../utils/currencyFormater";

function TransferSummary({transfer}) {
    return (
        <div className="card z-depth-0 transfer-summary">
            <div className="card-content gery-text text-darken-3">
                <span className="card-title">{currencyFormater(transfer.value)}</span>
                <p className="grey-text">{transfer.id}</p>
                <p>{transfer.timestamp}</p>
                <p>{transfer.account_code}</p>
                <p>{transfer.account_agent_id}</p>
            </div>
        </div>
    )
}

export default TransferSummary;