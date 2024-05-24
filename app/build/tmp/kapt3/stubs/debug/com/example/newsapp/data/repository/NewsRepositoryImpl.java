package com.example.newsapp.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/newsapp/data/repository/NewsRepositoryImpl;", "Lcom/example/newsapp/domain/repository/NewsRepository;", "newsApi", "Lcom/example/newsapp/data/remote/NewsApi;", "(Lcom/example/newsapp/data/remote/NewsApi;)V", "getTopHeadlines", "Lcom/example/newsapp/util/Resource;", "", "Lcom/example/newsapp/domain/model/Article;", "category", "", "countrycode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchForNews", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsRepositoryImpl implements com.example.newsapp.domain.repository.NewsRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.newsapp.data.remote.NewsApi newsApi = null;
    
    public NewsRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.newsapp.data.remote.NewsApi newsApi) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getTopHeadlines(@org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    java.lang.String countrycode, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.newsapp.util.Resource<java.util.List<com.example.newsapp.domain.model.Article>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object searchForNews(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.newsapp.util.Resource<java.util.List<com.example.newsapp.domain.model.Article>>> $completion) {
        return null;
    }
}