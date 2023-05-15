package com.qiuguan.boot.cloud.config;

import feign.RequestInterceptor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;

/**
 * @author qiuguan
 */
public class CdbClientConfig {

    @Value("${cdb.client.auth.key:}")
    private String authKey;

    @Bean
    public RequestInterceptor cdbAuthRequestInterceptor() {
        return template -> template.header("Key", StringUtils.isBlank(authKey) ? "cdb" : authKey);
    }


    protected ClassPathScanningCandidateComponentProvider getScanner(){
        return new ClassPathScanningCandidateComponentProvider(false, null) {
            @Override
            protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
                boolean isCandidate = false;
                if (beanDefinition.getMetadata().isIndependent()) {
                    if (!beanDefinition.getMetadata().isAnnotation()) {
                        isCandidate = true;
                    }
                }
                return isCandidate;
            }
        };
    }
}
