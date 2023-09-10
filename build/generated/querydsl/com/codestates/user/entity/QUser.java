package com.codestates.user.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1398931355L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUser user = new QUser("user");

    public final com.codestates.baseentity.QLibrary library;

    public final StringPath name = createString("name");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final ListPath<UserLoanHistory, QUserLoanHistory> userLoanHistories = this.<UserLoanHistory, QUserLoanHistory>createList("userLoanHistories", UserLoanHistory.class, QUserLoanHistory.class, PathInits.DIRECT2);

    public QUser(String variable) {
        this(User.class, forVariable(variable), INITS);
    }

    public QUser(Path<? extends User> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUser(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUser(PathMetadata metadata, PathInits inits) {
        this(User.class, metadata, inits);
    }

    public QUser(Class<? extends User> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.library = inits.isInitialized("library") ? new com.codestates.baseentity.QLibrary(forProperty("library")) : null;
    }

}

