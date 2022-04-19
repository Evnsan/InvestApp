import { Link } from "react-router-dom";
import TransferSummary from "./TransferSummary";

function TransferList({transfers}) {
    return (
        <div className="tranfer-list section">
            {transfers && transfers.map (transfer => {
                return (
                    <Link to={'/transfer/' + transfer.id} key={transfer.id}>
                        <TransferSummary transfer={transfer} />
                    </Link>
                )
            })}

        </div>
    )
}

export default TransferList;