import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.misc.TransactionManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) throws Exception {

        // this uses h2 by default but change to match your database
        String databaseUrl = "jdbc:sqlite:recite-words.db";
        // create a connection source to our database
        ConnectionSource connectionSource =
                new JdbcConnectionSource(databaseUrl);

        // instantiate the dao
        Dao<Global, String> globalDao =
                DaoManager.createDao(connectionSource, Global.class);

        // if you need to create the 'Globals' table make this call
        TableUtils.createTable(connectionSource, Global.class);
//        Once we have configured our database objects, we can use them to persist an Global to the database and query for it from the database by its ID:
        new TransactionManager(connectionSource).callInTransaction(() -> {
            return 0;
        });

        // create an instance of Global
        Global Global = new Global();
        Global.setCurrentWordNumber("test");
        Global.setCurrentBookName("test");
        Global.setAutoPlay(1);
        Global.setEngType(2);
        Global.setAutoLog(3);


        // persist the Global object to the database
        globalDao.create(Global);

        // retrieve the Global from the database by its id field (name)
        Global Global2 = globalDao.queryForFirst();
        System.out.println("Global: " + Global2.getCurrentWordNumber());

        // close the connection source
        connectionSource.close();
    }
}
