package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"vieport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("        <title>Admin Page - Shree Narayani Jewellers</title>\n");
      out.write("    </head>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        option{\n");
      out.write("            font-weight: 700;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("<body>\n");
      out.write("    <br>  \n");
      out.write("    \n");
      out.write("    <div class=\"container\" >\n");
      out.write("        <div class=\"row\" style=\" margin-right: 0px; \">\n");
      out.write("            <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                <div class=\"card  placing\">\n");
      out.write("                 <img src=\"images/Plus.png\" class=\"card-img-top\" alt=\"...\" style=\"max-height: 186.24px; margin: auto; max-width: 280px\"/>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                          <h5 class=\"card-title\">Add Product</h5>\n");
      out.write("                          <p class=\"card-text\">Click to add Product</p>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dark logInSwitch\" data-toggle=\"modal\" data-target=\"#AddModal\" >Add</a>\n");
      out.write("                        </div>\n");
      out.write("                      </div> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal fade\" id=\"AddModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"AddModalTitle\" aria-hidden=\"true\">\n");
      out.write("                    <div class=\"modal-dialog modal-lg modal-dialog-centered\" role=\"document\" >\n");
      out.write("                        <div class=\"modal-content\" style=\"border-radius: 10px; box-shadow: 2px 2px 10px 0px rgba(0,0,0,0.52);\">\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <div class=\"container\" style=\"max-width: 100%\">\n");
      out.write("                                    <h2>Add Product</h2>\n");
      out.write("                                    <form action=\"addProduct\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                    <div class=\"row\" style=\"width: 100%; \">\n");
      out.write("                                        <div class=\"col-lg-5 col-sm-12\">\n");
      out.write("                                            <br>\n");
      out.write("                                            <img src=\"images/Plus.png\" class=\"modalImage\" >\n");
      out.write("                                            <br><br>\n");
      out.write("                                            <input class=\"btn\" type=\"file\" id=\"img\" name=\"img\" accept=\"image/* \" size=\"50\">\n");
      out.write("                                            <br><br>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-lg-7 col-sm-12\" style=\"text-align: left; \">\n");
      out.write("                                            <label for=\"itemName\" style=\"margin-bottom: 0px;\">Item Name:</label>\n");
      out.write("                                            <input name=\"item_name\" class=\"form-control customInput\" id=\"itemName\" style=\"margin-top: 0px;\" placeholder=\"Enter Item Name\"><br>\n");
      out.write("                                            <label for=\"details1\" style=\"margin-bottom: 0px;\">Category:</label>\n");
      out.write("                                            <select name=\"category\" class=\"form-control customInput\" id=\"details1\" style=\"margin-top: 0px;\">\n");
      out.write("                                                <option value=\"Pooja Item\" selected> Pooja Item </option>\n");
      out.write("                                                <option value=\"Aarta Thali\"> Aarta Thali </option>\n");
      out.write("                                                <option value=\"Box\"> Box </option>\n");
      out.write("                                                <option value=\"Gifts\"> Gifts </option>\n");
      out.write("                                                <option value=\"Home Decor\"> Home Decor </option>\n");
      out.write("                                                <option value=\"Household\"> Household </option>\n");
      out.write("                                                <option value=\"Jugset\"> Jugset </option>\n");
      out.write("                                                <option value=\"Kids\"> Kids </option>\n");
      out.write("                                                <option value=\"Luxury\"> Luxury </option>\n");
      out.write("                                                <option value=\"Photo Frame\"> Photo Frame </option>\n");
      out.write("                                                <option value=\"Coins\"> Coins </option>\n");
      out.write("                                            </select><br>\n");
      out.write("                                            <label for=\"details2\" style=\"margin-bottom: 0px;\">Weight(approx.):</label>\n");
      out.write("                                            <input name=\"weight\" class=\"form-control customInput\" id=\"details2\" style=\"margin-top: 0px;\" placeholder=\"Enter Weight\"><br>\n");
      out.write("                                            <label for=\"details3\" style=\"margin-bottom: 0px;\">Polish:</label>\n");
      out.write("                                            <input name=\"polish\" class=\"form-control customInput\" id=\"details3\" style=\"margin-top: 0px;\" placeholder=\"Specify Polish\"><br>\n");
      out.write("                                            <label for=\"details4\" style=\"margin-bottom: 0px;\">Purity:</label>\n");
      out.write("                                            <input name=\"purity\" class=\"form-control customInput\" id=\"details4\" style=\"margin-top: 0px;\" placeholder=\"Amount of Purity\"><br>\n");
      out.write("                                            <label for=\"details\" style=\"margin-bottom: 0px;\">Description:</label>\n");
      out.write("                                            <input name=\"description\" class=\"form-control customInput\" id=\"details5\" style=\"margin-top: 0px;\" placeholder=\"Some Description\"><br>\n");
      out.write("                                            \n");
      out.write("                                            <input type=\"submit\" class=\"btn btn-dark logInSwitch\" value=\"Add\"/>\n");
      out.write("                                            <br>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </form>\n");
      out.write("                                 </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html> \n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.size() > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setBegin(0);
    _jspx_th_c_forEach_0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.size() - 1}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
          out.write("                    <div class=\"card  placing\">\n");
          out.write("                        <img src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.get(i).getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"card-img-top\" alt=\"...\" style=\"max-height: 186.24px; margin: auto; width: auto !important; max-width: 280px;min-height: 186.24px\"/>\n");
          out.write("                            <div class=\"card-body\">\n");
          out.write("                              <h5 class=\"card-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.get(i).getItemname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                              <p class=\"card-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.get(i).getCategory()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                              <a href=\"#\" class=\"btn btn-dark logInSwitch\" data-toggle=\"modal\" data-target=\"#Modify");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >Modify</a>\n");
          out.write("                              <a href=\"#\" class=\"btn btn-outline-dark logInSwitch\" data-toggle=\"modal\" data-target=\"#Confirm");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >Delete</a>\n");
          out.write("                            </div>\n");
          out.write("                          </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"modal fade\" id=\"Confirm");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"ConfirmModalTitle\" aria-hidden=\"true\">\n");
          out.write("                    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
          out.write("                        <div class=\"modal-content\">\n");
          out.write("                            <div class=\"modal-body\">\n");
          out.write("                                <form method=\"post\" action=\"deleteProduct\">\n");
          out.write("                                <span class=\"form-group\">\n");
          out.write("                                    <h4 >Hi, ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("!</h4>\n");
          out.write("                                    <h6>&nbsp;&nbsp;&nbsp;&nbsp;Are you sure you want to delete this product?</h6>\n");
          out.write("                                    <input type=\"hidden\" name=\"p_img\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.get(i).getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                    <input type=\"submit\" class=\"btn btn-dark otpButton\" value=\"Confirm\"/>\n");
          out.write("                                    <button name=\"\" class=\"btn btn-danger btn-md otpButton\" data-dismiss=\"modal\" aria-label=\"Close\">Cancel</button>\n");
          out.write("                                </span>\n");
          out.write("                                </form>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("               </div>\n");
          out.write("                <div class=\"modal fade\" id=\"Modify");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"ModifyModalTitle\" aria-hidden=\"true\">\n");
          out.write("                    <div class=\"modal-dialog modal-lg modal-dialog-centered\" role=\"document\" >\n");
          out.write("                        <div class=\"modal-content\" style=\"border-radius: 10px; box-shadow: 2px 2px 10px 0px rgba(0,0,0,0.52);\">\n");
          out.write("                            <div class=\"modal-body\">\n");
          out.write("                                <div class=\"container\" style=\"max-width: 100%\">\n");
          out.write("                                    <h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.get(i).getItemname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                    <form action=\"updateProduct\" method=\"post\" enctype=\"multipart/form-data\">\n");
          out.write("                                    <div class=\"row\" style=\"width: 100%; \">\n");
          out.write("                                        <div class=\"col-lg-5 col-sm-12\">\n");
          out.write("                                            <br>\n");
          out.write("                                            <img src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.get(i).getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"modalImage\" >\n");
          out.write("                                            <br><br>\n");
          out.write("                                            <input class=\"btn\" type=\"file\" id=\"img\" name=\"img\" accept=\"image/*\">\n");
          out.write("                                            <br><br>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"col-lg-7 col-sm-12\" style=\"text-align: left; \">\n");
          out.write("                                            <label for=\"itemName\" style=\"margin-bottom: 0px;\">Item Name:</label>\n");
          out.write("                                            <input name=\"item_name\" class=\"form-control customInput\" id=\"itemName\" style=\"margin-top: 0px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.get(i).getItemname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br>\n");
          out.write("                                            <label for=\"details1\" style=\"margin-bottom: 0px;\">Category:</label>\n");
          out.write("                                            <select name=\"category\" class=\"form-control customInput\" id=\"details1\" style=\"margin-top: 0px;\">\n");
          out.write("                                                <option value=\"Pooja Item\" ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("> Pooja Item </option>\n");
          out.write("                                                <option value=\"Aarta Thali\" ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("> Aarta Thali </option>\n");
          out.write("                                                <option value=\"Box\" ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("> Box </option>\n");
          out.write("                                                <option value=\"Gifts\" ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("> Gifts </option>\n");
          out.write("                                                <option value=\"Home Decor\" ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("> Home Decor </option>\n");
          out.write("                                                <option value=\"Household\" ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("> Household </option>\n");
          out.write("                                                <option value=\"Jugset\" ");
          if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("> Jugset </option>\n");
          out.write("                                                <option value=\"Kids\" ");
          if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("> Kids </option>\n");
          out.write("                                                <option value=\"Luxury\" ");
          if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("> Luxury </option>\n");
          out.write("                                                <option value=\"Photo Frame\" ");
          if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("> Photo Frame </option>\n");
          out.write("                                                <option value=\"Coins\" ");
          if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("> Coins </option>\n");
          out.write("                                            </select><br>\n");
          out.write("                                            <label for=\"details2\" style=\"margin-bottom: 0px;\">Weight(approx.):</label>\n");
          out.write("                                            <input name=\"weight\" class=\"form-control customInput\" id=\"details2\" style=\"margin-top: 0px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.get(i).getWeight()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br>\n");
          out.write("                                            <label for=\"details3\" style=\"margin-bottom: 0px;\">Polish:</label>\n");
          out.write("                                            <input name=\"polish\" class=\"form-control customInput\" id=\"details3\" style=\"margin-top: 0px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.get(i).getPolish()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br>\n");
          out.write("                                            <label for=\"details4\" style=\"margin-bottom: 0px;\">Purity:</label>\n");
          out.write("                                            <input name=\"purity\" class=\"form-control customInput\" id=\"details4\" style=\"margin-top: 0px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.get(i).getPurity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br>\n");
          out.write("                                            <label for=\"details\" style=\"margin-bottom: 0px;\">Description:</label>\n");
          out.write("                                            <input name=\"description\" class=\"form-control customInput\" id=\"details5\" style=\"margin-top: 0px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.get(i).getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br>\n");
          out.write("                                            <input type=\"hidden\" name=\"p_img\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.get(i).getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/> \n");
          out.write("                                            <input type=\"submit\" class=\"btn btn-dark logInSwitch\" value=\"Save\" />\n");
          out.write("                                            <br>\n");
          out.write("                                            \n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    </form>\n");
          out.write("                                 </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                \n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"Pooja Item\".equals(prod.get(i).getCategory())}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"Aarta Thali\".equals(prod.get(i).getCategory())}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"Box\".equals(prod.get(i).getCategory())}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"Gifts\".equals(prod.get(i).getCategory())}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"Home Decor\".equals(prod.get(i).getCategory())}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"Household\".equals(prod.get(i).getCategory())}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"Jugset\".equals(prod.get(i).getCategory())}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"Kids\".equals(prod.get(i).getCategory())}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"Luxury\".equals(prod.get(i).getCategory())}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"Photo Frame\".equals(prod.get(i).getCategory())}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"Coins\".equals(prod.get(i).getCategory())}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }
}
