package com.odin.challengeaccepted.database.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.odin.challengeaccepted.api.dto.PostResponse;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
@SuppressWarnings("unchecked")
public class PostDao_Impl implements PostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfPostResponse;

  public PostDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPostResponse = new EntityInsertionAdapter<PostResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `PostResponse`(`userId`,`id`,`title`,`body`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PostResponse value) {
        stmt.bindLong(1, value.getUserId());
        stmt.bindLong(2, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getBody() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBody());
        }
      }
    };
  }

  @Override
  public void insertAll(PostResponse... posts) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPostResponse.insert(posts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<PostResponse> getAll() {
    final String _sql = "SELECT * FROM postresponse";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfUserId = _cursor.getColumnIndexOrThrow("userId");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfBody = _cursor.getColumnIndexOrThrow("body");
      final List<PostResponse> _result = new ArrayList<PostResponse>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PostResponse _item;
        _item = new PostResponse();
        final int _tmpUserId;
        _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
        _item.setUserId(_tmpUserId);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item.setTitle(_tmpTitle);
        final String _tmpBody;
        _tmpBody = _cursor.getString(_cursorIndexOfBody);
        _item.setBody(_tmpBody);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
