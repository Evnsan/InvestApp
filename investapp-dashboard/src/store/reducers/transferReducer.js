const initState = {
    transfers: []
}

function transferReducer(state = initState, action) {
    switch (action.type) {
        case 'LOAD_TRANSFERS':
            const newState = {
                ...state,
                transfers: action.transfers
            }
            return newState
        default: return state
    }
}

export default transferReducer;
