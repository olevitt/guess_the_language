package utils

import io.javalin.Context
import java.lang.Exception
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet

fun accueil(ctx: Context) {
}

fun forbidden(ctx: Context) {
    ctx.result("THIS IS FORBIDDEN !")
}

fun subscribeOrConnect(ctx: Context) {
    try {
        var conn: Connection? = DriverManager.getConnection(utils.BDD_URL)

        if (conn != null) {
            var regex = "^[a-zA-Z0-9_]+$".toRegex()
            val pseudo = ctx.pathParam("pseudo")

            var exists : Boolean?
            var selectRequest = "SELECT * FROM users WHERE pseudo = $pseudo"
            val select = conn.createStatement()
            var result : ResultSet = select.executeQuery(selectRequest)

            if(!result.wasNull()){
                if(regex.matches(pseudo)) {

                    var insertRequest = "INSERT OR IGNORE INTO users(pseudo) VALUES($pseudo)"
                    val insert = conn.prepareStatement(insertRequest)
                    insert.executeUpdate()
                    conn.close()

                } else {
                    //WRONG PSEUDO
                }
            } else {
                conn.close()
                //ALREADY EXISTS
            }
        }
    } catch(e : Exception) {
        e.printStackTrace()
    }
}

fun nextLevel(ctx: Context) {
    try {
        var conn: Connection? = DriverManager.getConnection(utils.BDD_URL)

        if (conn != null) {

        }

    } catch(e : Exception) {
        e.printStackTrace()
    }
}

fun getMoreLogo(ctx: Context) {
}

fun how_the_fuck_i_play_your_game(ctx: Context) {
}