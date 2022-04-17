const formater = new Intl.NumberFormat('pt-BR', {
    style: 'currency',
    currency: 'BRL'
});

function currencyFormater(value) {
    return (
        formater.format(value)
    )
}

export default currencyFormater;