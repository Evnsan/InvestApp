import React from 'react'

function TransferDetails(props) {
    console.log(props)
    const id = props.match.params.id
    return (
        <div className="container section transfer-details">
            <div className="card zdepth-0">
                <div className="card-content">
                    <span className="card-title">{id}</span>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nostrum repellendus, quam enim ratione accusamus maxime, assumenda voluptatem delectus rerum ipsum dolore minima quos obcaecati. Similique quisquam a placeat dolorum in?</p>
                </div>
                <div className="card-action grey lighten-4 grey-text">
                    <div>Hardcoded Text</div>
                    <div>Anoder hardcoded text</div>
                </div>
            </div>
        </div>
    )
}

export default TransferDetails;