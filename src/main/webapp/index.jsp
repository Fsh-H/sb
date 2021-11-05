<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <h2>Hello World!</h2>
    <form action="Hello.do" method="post">
        用户名：<input type="text" name="uname"> <p></p>
        <input type="submit" value="提交">
    </form>
    <%pageContext.setAttribute("path",request.getContextPath());%>
    <form action="Hello1.do" method="post">
        名字：<input type="text" name="name"> <p></p>
        <input type="submit" value="提交">
    </form>

    <form action="Hello2.do" method="post">
        名字：<input type="text" name="name"> <p></p>
        学号：<input type="number" name="id">
        <input type="submit" value="提交">
    </form>

  <h2>
      Integer id;
      String name;
      String[] alias;
      List< String> hobbies;
      Map< String,String> relatives;
      Role role;
      List< Person> friends;
  </h2>

    <form action="Hello3.do" method="post">
        学号：<input type="number" name="id"> <p></p>
        名字：<input type="text" name="name"> <p></p>
        外号：
        <div>
            <label for="a">
                张三  <input type="checkbox" id="a" name="alias" value="张三" checked>
            </label> <p></p>
            <label for="b">
                李四  <input type="checkbox" id="b" name="alias" value="李四" checked>
            </label> <p></p>
            <label for="c">
                王五 <input type="checkbox" id="c" name="alias" value="王五" checked>
            </label>
        </div>
        爱好：
        <div>
            <label for="t">
                跳舞  <input type="checkbox" id="t" name="hobbies[0]" value="跳舞" checked>
            </label> <p></p>
            <label for="y">
                唱歌  <input type="checkbox" id="y" name="hobbies[1]" value="唱歌" checked>
            </label>
        </div>
        亲属：
        <div>
            <label for="d">
                爸爸  <input type="checkbox" id="d" name="relatives['father']" value="爸爸" checked>
            </label> <p></p>
            <label for="e">
                妈妈  <input type="checkbox" id="e" name="relatives['mum']" value="妈妈" checked>
            </label> <p></p>
        </div>

      <div>
          角色：<input type="text" name="role.name"><p></p>
          <input type="number" name="role.id">
      </div>

        朋友:<input name="friends[0].name" type="text" value="张伞"> <br>
        <input name="friend[1].name" type="text" value="李斯"><br>

        <input type="submit" value="提交">
    </form>
</body>
</html>
