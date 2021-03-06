import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {
    private static final String name= "dbAlunoCriar";
    private  static final int version = 1;
    public Conexao(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String cria_tabela = "create table tbAluno ( id integwr primary key autoincrement," +
                "nome varchar(50), email varchar(50),telefone varchar(10))";
        db.execSQL(cria_tabela);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
