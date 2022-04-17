const initState = {
    transfers: [
        {
            id: '3c0f67e2-1c13-4e95-a054-90124b6af1a3',
            timestamp: '2020-11-10 00:00:00',
            value: 30.000,
            account_code: '0001.943-9',
            account_agent_id: '3982c960-48c3-466e-a8b9-f845d16b36c4'
        },
        {
            id: '18fec9d9-0f95-421a-853a-1021c1f45124',
            timestamp: '2020-11-10 00:00:00',
            value: 300.000,
            account_code: '0001.943-9',
            account_agent_id: '3982c960-48c3-466e-a8b9-f845d16b36c4'
        }
    ]
}

function transferReducer(state = initState, action) {
return state
}

export default transferReducer;
