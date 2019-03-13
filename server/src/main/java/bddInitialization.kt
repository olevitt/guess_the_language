package utils

import java.sql.Connection
import java.sql.DriverManager

fun main(list : List<String>) {
    initBdd();
}

fun initBdd() {

    val url = utils.BDD_URL;

    try {
        var conn: Connection? = DriverManager.getConnection(url)

        if (conn != null) {
            var createTableReq = "CREATE IF NOT EXISTS users(\n"
                + "id integer PRIMARY KEY, \n"
                + "pseudo varchar(35), \n"
                + "level integer, \n"
                + "points integer \n"
                + ");"
            var createTable = conn.prepareStatement(createTableReq)

            createTable.executeUpdate()
        }
    } catch(e : Exception) {
        e.printStackTrace()
    }
}
