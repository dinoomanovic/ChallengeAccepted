package com.odin.challengeaccepted.database.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J!\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/odin/challengeaccepted/database/dao/UserDao;", "", "getUsers", "Lio/reactivex/Single;", "", "Lcom/odin/challengeaccepted/api/dto/UserResponse;", "insertAll", "", "users", "", "([Lcom/odin/challengeaccepted/api/dto/UserResponse;)V", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM userresponse")
    public abstract io.reactivex.Single<java.util.List<com.odin.challengeaccepted.api.dto.UserResponse>> getUsers();
    
    @android.arch.persistence.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.odin.challengeaccepted.api.dto.UserResponse... users);
}