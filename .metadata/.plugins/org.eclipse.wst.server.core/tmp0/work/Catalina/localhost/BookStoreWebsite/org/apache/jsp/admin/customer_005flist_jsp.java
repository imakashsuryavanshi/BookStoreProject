/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2024-03-12 17:06:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/admin/footer.jsp", Long.valueOf(1703425009599L));
    _jspx_dependants.put("jar:file:/C:/Users/Abc/Desktop/BookStoreProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BookStoreWebsite/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/admin/header.jsp", Long.valueOf(1710257347485L));
    _jspx_dependants.put("jar:file:/C:/Users/Abc/Desktop/BookStoreProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BookStoreWebsite/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1702826646116L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"ISO-8859-1\">\r\n");
      out.write("	<title>Manage Customers - Evergreen Bookstore Administration</title>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("	<div>\r\n");
      out.write("	<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/\">\r\n");
      out.write("		<img alt=\"BookStoreAdminLogo\" src=\"../images/BookStoreAdminLogo.png\" height=\"90\" width=\"60%\">\r\n");
      out.write("	</a>\r\n");
      out.write("	</div> <br/> \r\n");
      out.write("	<div>\r\n");
      out.write("		Welcome, ");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write(" | <a href=\"logout\">Logout</a>\r\n");
      out.write("	</div> <br/> \r\n");
      out.write("	<div id=\"headermenu\">\r\n");
      out.write("		<div>\r\n");
      out.write("			<a href=\"list_users\">\r\n");
      out.write("				<img height=\"70\" alt=\"Users\" src=\"../images/user.png\"> <br>Users\r\n");
      out.write("			</a> \r\n");
      out.write("		</div>\r\n");
      out.write("		<div>\r\n");
      out.write("			<a href=\"list_category\">\r\n");
      out.write("				<img height=\"70\" alt=\"Categories\" src=\"../images/category.png\"> <br>Categories\r\n");
      out.write("			</a> \r\n");
      out.write("		</div>\r\n");
      out.write("		<div>\r\n");
      out.write("			<a href=\"list_books\">\r\n");
      out.write("				<img height=\"70\" alt=\"Books\" src=\"../images/book.png\"> <br>Books\r\n");
      out.write("			</a> \r\n");
      out.write("		</div>\r\n");
      out.write("		<div>\r\n");
      out.write("			<a href=\"list_customer\">\r\n");
      out.write("				<img height=\"70\" alt=\"Customers\" src=\"../images/customer.png\"> <br>Customers\r\n");
      out.write("			</a> \r\n");
      out.write("		</div>\r\n");
      out.write("		<div>\r\n");
      out.write("			<a href=\"reviews\">\r\n");
      out.write("				<img height=\"70\" alt=\"Reviews\" src=\"../images/review.png\"> <br>Reviews\r\n");
      out.write("			</a> \r\n");
      out.write("		</div>\r\n");
      out.write("		<div>\r\n");
      out.write("			<a href=\"orders\">\r\n");
      out.write("				<img height=\"70\" alt=\"Orders\" src=\"../images/order.png\"> <br>Orders\r\n");
      out.write("			</a> \r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("</div>");
      out.write("<br>\r\n");
      out.write("	<div align=\"center\">\r\n");
      out.write("		<h2 class=\"pageheading\">Customers Management</h2>\r\n");
      out.write("		<h3><a href =\"customer_form.jsp\">Create New Customer</a></h3>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<div align=\"center\">\r\n");
      out.write("		<table border=\"1\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>Index</th>\r\n");
      out.write("				<th>ID</th>\r\n");
      out.write("				<th>E-mail</th>\r\n");
      out.write("				<th>Full Name</th>\r\n");
      out.write("				<th>City</th>\r\n");
      out.write("				<th>Country</th>\r\n");
      out.write("				<th>Registered Date</th>\r\n");
      out.write("				<th>Actions</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("<div align=\"center\">\r\n");
      out.write("	<h4>Bookstore Administration</h4>\r\n");
      out.write("	<h4>Copyright (C) Evergreen Books Co., Ltd</h4>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("		$(\".deleteLink\").each(function() {\r\n");
      out.write("			$(this).on(\"click\", function(){\r\n");
      out.write("				bookId = $(this).attr(\"id\");\r\n");
      out.write("				if(confirm('Are you sure you want to delete the book with ID '+bookId+' ?')){\r\n");
      out.write("					window.location = 'delete_book?id='+bookId;\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /admin/header.jsp(9,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.useremail}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /admin/customer_list.jsp(20,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message != null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<div align=\"center\">\r\n");
          out.write("		<h4 class=\"message\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("	</div>\r\n");
          out.write("	");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /admin/customer_list.jsp(38,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("customer");
      // /admin/customer_list.jsp(38,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/admin/customer_list.jsp(38,3) '${listCustomer}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${listCustomer}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /admin/customer_list.jsp(38,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("status");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("			<tr>\r\n");
            out.write("				<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index + 1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("				<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.customerId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("				<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("				<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.fullname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("				<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.city}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("				<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.country}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("				<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.registerDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("				\r\n");
            out.write("				<td>\r\n");
            out.write("					<a href=\"edit_customer?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.customerId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">Edit</a>&nbsp;\r\n");
            out.write("					<a href=\"javascript:void(0);\" class=\"deleteLink\" id=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.customerId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">Delete</a>\r\n");
            out.write("				</td>\r\n");
            out.write("			</tr>\r\n");
            out.write("			");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
