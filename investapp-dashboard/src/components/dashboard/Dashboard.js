import React from "react";
import TransferList from "../transfers/TransferList";
import { connect } from "react-redux";
import { loadTransfers } from "../../store/actions/transferActions";

class Dashboard extends React.Component {
    componentDidMount() {
        this.props.loadTransfers();
    }
    render() {
        //console.log(this.props);
        const { transfers } = this.props;
        return (
            <div className="dashboard container">
                <div className="row">
                    <div className="col s12 m6">
                        <TransferList transfers={transfers} />
                    </div>
                    <div className="col s12 m5 offset-m1">

                    </div>
                </div>
            </div>
        )
    }
}

const mapStateToProps = (state) => {
    return {
        transfers: state.transfer.transfers
    }
}

const mapDispatchToProps = (dispatch) => {
    return {
        loadTransfers: () => {
            dispatch(loadTransfers())
        }
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(Dashboard);