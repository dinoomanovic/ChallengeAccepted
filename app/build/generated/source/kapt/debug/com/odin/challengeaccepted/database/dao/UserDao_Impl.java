package com.odin.challengeaccepted.database.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EmptyResultSetException;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.odin.challengeaccepted.api.dto.UserResponse;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
@SuppressWarnings("unchecked")
public class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserResponse;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserResponse = new EntityInsertionAdapter<UserResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `UserResponse`(`id`,`name`,`username`,`email`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserResponse value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUsername());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
      }
    };
  }

  @Override
  public void insertAll(UserResponse... users) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserResponse.insert(users);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Single<List<UserResponse>> getUsers() {
    final String _sql = "SELECT * FROM userresponse";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Single.fromCallable(new Callable<List<UserResponse>>() {
      @Override
      public List<UserResponse> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfUsername = _cursor.getColumnIndexOrThrow("username");
          final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("email");
          final java.util.List<com.odin.challengeaccepted.api.dto.UserResponse> _result = new java.util.ArrayList<com.odin.challengeaccepted.api.dto.UserResponse>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final com.odin.challengeaccepted.api.dto.UserResponse _item;
            _item = new com.odin.challengeaccepted.api.dto.UserResponse();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final java.lang.String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item.setName(_tmpName);
            final java.lang.String _tmpUsername;
            _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            _item.setUsername(_tmpUsername);
            final java.lang.String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            _item.setEmail(_tmpEmail);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
