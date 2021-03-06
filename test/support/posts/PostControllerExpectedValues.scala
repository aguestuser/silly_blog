package support.posts

/**
 * Author: @aguestuser
 * Date: 4/2/15
 */

trait PostControllerExpectedValues {
  lazy val getCreateHtml = "\n\n\n<h1>New Post</h1>\n \n\n<form action=\"/posts/create\" method=\"POST\" >\n    \n    \n\n\n\n\n\n\n\n\n\n<dl class=\" \" id=\"title_field\">\n    \n    <dt><label for=\"title\">title</label></dt>\n    \n    <dd>\n    <input type=\"text\" id=\"title\" name=\"title\" value=\"\" />\n</dd>\n    \n    \n        <dd class=\"info\">constraint.minLength</dd>\n    \n</dl>\n\n\n\n    \n\n\n\n\n\n\n\n<dl class=\" \" id=\"body_field\">\n    \n    <dt><label for=\"body\">body</label></dt>\n    \n    <dd>\n    <textarea id=\"body\" name=\"body\" ></textarea>\n</dd>\n    \n    \n        <dd class=\"info\">constraint.minLength</dd>\n    \n</dl>\n\n\n\n    <input type=\"submit\" value=\"Save\">\n\n</form>\n\n"
  def getEditHtml(id: Long): String = "\n\n\n<h1>Edit Post</h1>\n\n\n \n\n<form action=\"/posts/edit/"+id+"\" method=\"POST\" >\n    \n    \n\n\n\n\n\n\n\n\n\n<dl class=\" \" id=\"title_field\">\n    \n    <dt><label for=\"title\">title</label></dt>\n    \n    <dd>\n    <input type=\"text\" id=\"title\" name=\"title\" value=\"first post\" />\n</dd>\n    \n    \n        <dd class=\"info\">constraint.minLength</dd>\n    \n</dl>\n\n\n\n    \n\n\n\n\n\n\n\n<dl class=\" \" id=\"body_field\">\n    \n    <dt><label for=\"body\">body</label></dt>\n    \n    <dd>\n    <textarea id=\"body\" name=\"body\" >what should i write?</textarea>\n</dd>\n    \n    \n        <dd class=\"info\">constraint.minLength</dd>\n    \n</dl>\n\n\n\n    <input type=\"submit\" value=\"Save\">\n\n</form>\n\n"
  lazy val num = 1
}
