package com.xxx.httptoken;

import javax.servlet.http.HttpServletRequest;

public interface TokenStrategy {

	public String getTokenId(HttpServletRequest req);
}
