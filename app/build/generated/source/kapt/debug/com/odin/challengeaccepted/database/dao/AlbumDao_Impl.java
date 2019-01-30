package com.odin.challengeaccepted.database.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.odin.challengeaccepted.api.dto.AlbumResponse;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
@SuppressWarnings("unchecked")
public class AlbumDao_Impl implements AlbumDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfAlbumResponse;

  public AlbumDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAlbumResponse = new EntityInsertionAdapter<AlbumResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `AlbumResponse`(`userId`,`id`,`title`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AlbumResponse value) {
        stmt.bindLong(1, value.getUserId());
        stmt.bindLong(2, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
      }
    };
  }

  @Override
  public void insertAll(AlbumResponse... albums) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfAlbumResponse.insert(albums);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<AlbumResponse> getAll() {
    final String _sql = "SELECT * FROM albumresponse";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfUserId = _cursor.getColumnIndexOrThrow("userId");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final List<AlbumResponse> _result = new ArrayList<AlbumResponse>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AlbumResponse _item;
        _item = new AlbumResponse();
        final int _tmpUserId;
        _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
        _item.setUserId(_tmpUserId);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item.setTitle(_tmpTitle);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
