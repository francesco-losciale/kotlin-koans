fun renderProductTable(): String {
    return html {
        table {
            tr (color = getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for (i in 0 until products.size) {
                tr (color = getCellColor(i, i)) {
                    td {
                        text(products.get(i).description)
                    }
                    td {
                        text(products.get(i).price)
                    }
                    td {
                        text(products.get(i).popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"
