import { combineReducers } from "redux";

import authReducer from "./authReducer";
import transferReducer from "./transferReducer";

const rootReducer = combineReducers({
    auth: authReducer,
    transfer: transferReducer
});

export default rootReducer;