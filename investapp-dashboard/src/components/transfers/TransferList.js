import TransferSummary from "./TransferSummary";

function TransferList({transfers}) {
    return (
        <div className="tranfer-list section">
            {transfers && transfers.map (transfer => {
                return (
                    <TransferSummary transfer={transfer} key={transfer.id} />
                )
            })}

        </div>
    )
}

export default TransferList;