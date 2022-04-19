import React from 'react'
import { connect } from 'react-redux'
import { loadTransfers } from '../../store/actions/transferActions'
import currencyFormater from '../../utils/currencyFormater'

function TransferDetails(props) {
    console.log(props)
    const transfer_id = props.match.params.transfer_id
    console.log(transfer_id)
    const transfer = props.transfers.find(transfer => transfer.id === transfer_id)
    if (transfer) {
        return (
            <div className="container section transfer-details">
                <div className="card zdepth-0">
                    <div className="card-content">
                        <span className="card-title">{currencyFormater(transfer.value)}</span>
                        <p>{transfer.timestamp}</p>
                    </div>
                    <div className="card-action grey lighten-4 grey-text">
                        <div>{transfer.account_code}</div>
                        <div>{transfer.account_agent_id}</div>
                    </div>
                </div>
            </div>
        )
    } else {
        props.loadTransfers();
        return (
            <div className="red-text">LOADING DATA...</div>
        )
    }
}

function mapStateToProps(state) {
    return {
        transfers: state.transfer.transfers
    }
}

function mapDispatchToProps(dispatch) {
    return {
        loadTransfers: () => dispatch(loadTransfers())
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(TransferDetails);