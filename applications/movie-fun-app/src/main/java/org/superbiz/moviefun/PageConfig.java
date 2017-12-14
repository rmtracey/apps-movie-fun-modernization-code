package org.superbiz.moviefun;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.superbiz.moviefun.moviesapi.PageSizeProvider;

@Configuration
@RefreshScope
public class PageConfig implements PageSizeProvider {

    @Value("${movies.pagesize}")
    public int pageSize;

    public int getPageSize() {
        return pageSize;
    }
}
