<%@page import="model.MyConnection"%>
<%
  if(MyConnection.getConnection() != null){
    out.print("Conex�o bem sucedida");
    out.print("Nome do Banco de dados: " + MyConnection.getConnection().getCatalog());
    }else{
        out.print("Erro de conex�o");
    }
%>