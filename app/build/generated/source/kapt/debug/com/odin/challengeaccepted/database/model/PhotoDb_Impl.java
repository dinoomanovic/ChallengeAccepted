package com.odin.challengeaccepted.database.model;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import com.odin.challengeaccepted.database.dao.PhotoDao;
import com.odin.challengeaccepted.database.dao.PhotoDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import javax.annotation.Generated;

@Generated("android.arch.persistence.room.RoomProcessor")
@SuppressWarnings("unchecked")
public class PhotoDb_Impl extends PhotoDb {
  private volatile PhotoDao _photoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PhotoResponse` (`albumId` INTEGER NOT NULL, `id` INTEGER NOT NULL, `title` TEXT NOT NULL, `url` TEXT NOT NULL, `thumbnailUrl` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"cc81fe05f7c40f31ec4f467c1b1a78f5\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `PhotoResponse`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPhotoResponse = new HashMap<String, TableInfo.Column>(5);
        _columnsPhotoResponse.put("albumId", new TableInfo.Column("albumId", "INTEGER", true, 0));
        _columnsPhotoResponse.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsPhotoResponse.put("title", new TableInfo.Column("title", "TEXT", true, 0));
        _columnsPhotoResponse.put("url", new TableInfo.Column("url", "TEXT", true, 0));
        _columnsPhotoResponse.put("thumbnailUrl", new TableInfo.Column("thumbnailUrl", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPhotoResponse = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPhotoResponse = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPhotoResponse = new TableInfo("PhotoResponse", _columnsPhotoResponse, _foreignKeysPhotoResponse, _indicesPhotoResponse);
        final TableInfo _existingPhotoResponse = TableInfo.read(_db, "PhotoResponse");
        if (! _infoPhotoResponse.equals(_existingPhotoResponse)) {
          throw new IllegalStateException("Migration didn't properly handle PhotoResponse(com.odin.challengeaccepted.api.dto.PhotoResponse).\n"
                  + " Expected:\n" + _infoPhotoResponse + "\n"
                  + " Found:\n" + _existingPhotoResponse);
        }
      }
    }, "cc81fe05f7c40f31ec4f467c1b1a78f5", "9c821ef5637fae6d727b08e040fd1454");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "PhotoResponse");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `PhotoResponse`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public PhotoDao photoDao() {
    if (_photoDao != null) {
      return _photoDao;
    } else {
      synchronized(this) {
        if(_photoDao == null) {
          _photoDao = new PhotoDao_Impl(this);
        }
        return _photoDao;
      }
    }
  }
}
