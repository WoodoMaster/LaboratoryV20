package com.niptis.LaboratoryV20.filter;

import java.io.*;

import javax.servlet.*;

public class CharsetFilter implements Filter {
    private String requestEncoding;
    private String responseEncoding;

    public void init(FilterConfig config) throws ServletException {
        requestEncoding = setEncodingIfNull(config, "requestEncoding");
        responseEncoding = setEncodingIfNull(config, "responseEncoding");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain next)
            throws IOException, ServletException {
        request.setCharacterEncoding(requestEncoding);
        response.setCharacterEncoding(responseEncoding);
        next.doFilter(request, response);
    }

    private String setEncodingIfNull(FilterConfig config, String paramName) {
        String encoding = config.getInitParameter(paramName);
        if (encoding == null) {
            encoding = "utf-8";
        }
        return encoding;
    }

    public void destroy() {
    }
}

