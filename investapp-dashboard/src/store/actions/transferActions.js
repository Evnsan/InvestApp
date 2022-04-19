export function loadTransfers() {
    return (dispatch, getState) => {
        //async call
        fetch('http://localhost:8080/transfer')
        .then(handleErrors)
        .then(res => res.json())
        .then(json => {
            console.log(json);
            dispatch({ type: 'LOAD_TRANSFERS', transfers: json });
        })
        .catch (error => console.log('ERROR:', error));
    }
}

function handleErrors(response) {
    if (!response.ok) {
        throw Error(response.statusText);
    }
    return response;
}