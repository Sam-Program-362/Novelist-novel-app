.class public interface abstract Lorg/apache/tika/metadata/Database;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COLUMN_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final COLUMN_NAME:Lorg/apache/tika/metadata/Property;

.field public static final PREFIX:Ljava/lang/String; = "database:"

.field public static final ROW_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final TABLE_NAME:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "database:table_name"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lorg/apache/tika/metadata/Database;->TABLE_NAME:Lorg/apache/tika/metadata/Property;

    .line 8
    .line 9
    const-string v0, "database:row_count"

    .line 10
    .line 11
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lorg/apache/tika/metadata/Database;->ROW_COUNT:Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    const-string v0, "database:column_count"

    .line 18
    .line 19
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lorg/apache/tika/metadata/Database;->COLUMN_COUNT:Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    const-string v0, "database:column_name"

    .line 26
    .line 27
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->externalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lorg/apache/tika/metadata/Database;->COLUMN_NAME:Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    return-void
.end method
