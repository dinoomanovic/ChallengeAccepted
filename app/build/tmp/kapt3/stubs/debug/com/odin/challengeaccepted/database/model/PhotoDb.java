package com.odin.challengeaccepted.database.model;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {com.odin.challengeaccepted.api.dto.PhotoResponse.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/odin/challengeaccepted/database/model/PhotoDb;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "photoDao", "Lcom/odin/challengeaccepted/database/dao/PhotoDao;", "app_debug"})
public abstract class PhotoDb extends android.arch.persistence.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.odin.challengeaccepted.database.dao.PhotoDao photoDao();
    
    public PhotoDb() {
        super();
    }
}