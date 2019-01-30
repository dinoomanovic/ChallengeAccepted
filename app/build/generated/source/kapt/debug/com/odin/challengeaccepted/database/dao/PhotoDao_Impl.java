package com.odin.challengeaccepted.database.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EmptyResultSetException;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.odin.challengeaccepted.api.dto.PhotoResponse;
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
public class PhotoDao_Impl implements PhotoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfPhotoResponse;

  public PhotoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPhotoResponse = new EntityInsertionAdapter<PhotoResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `PhotoResponse`(`albumId`,`id`,`title`,`url`,`thumbnailUrl`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PhotoResponse value) {
        stmt.bindLong(1, value.getAlbumId());
        stmt.bindLong(2, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUrl());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getThumbnailUrl());
        }
      }
    };
  }

  @Override
  public void insertAll(PhotoResponse... photos) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPhotoResponse.insert(photos);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Single<List<PhotoResponse>> getPhotos() {
    final String _sql = "SELECT * FROM photoresponse";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Single.fromCallable(new Callable<List<PhotoResponse>>() {
      @Override
      public List<PhotoResponse> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfAlbumId = _cursor.getColumnIndexOrThrow("albumId");
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfUrl = _cursor.getColumnIndexOrThrow("url");
          final int _cursorIndexOfThumbnailUrl = _cursor.getColumnIndexOrThrow("thumbnailUrl");
          final java.util.List<com.odin.challengeaccepted.api.dto.PhotoResponse> _result = new java.util.ArrayList<com.odin.challengeaccepted.api.dto.PhotoResponse>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final com.odin.challengeaccepted.api.dto.PhotoResponse _item;
            _item = new com.odin.challengeaccepted.api.dto.PhotoResponse();
            final int _tmpAlbumId;
            _tmpAlbumId = _cursor.getInt(_cursorIndexOfAlbumId);
            _item.setAlbumId(_tmpAlbumId);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final java.lang.String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item.setTitle(_tmpTitle);
            final java.lang.String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            _item.setUrl(_tmpUrl);
            final java.lang.String _tmpThumbnailUrl;
            _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
            _item.setThumbnailUrl(_tmpThumbnailUrl);
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
