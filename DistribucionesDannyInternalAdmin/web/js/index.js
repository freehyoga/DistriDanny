/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
   inicializarEstilos();
   accionesPantalla();
   cargueInicial();
   
  
  
  
  function inicializarEstilos(){
    $( "#menu" ).menu({
        items: "> :not(.ui-widget-header)"
    });
    
    $( "#guardarBtn" ).button({
      icons: {
        primary: "ui-icon-disk"
      },
      text: true
    });
    $( "#limpiarBtn" ).button({
      icons: {
        primary: " ui-icon-refresh"
      },
      text: true
    });
  }
  
  function accionesPantalla(){
    $(".menuItem").click(function(){
        $("#contentDiv div").css("display","none");
        var idDiv = $(this).attr("ref");
        $("#"+idDiv).css("display","block");
    }); 
  }
  
  function cargueInicial(){
      $.ajax({
        url: '../IndexServlet',
        type: 'post',
        data: { accion:"1" },
        cache: false,
        success: function(data){
          if(data!=null && data.asignaturas!=null){
              var options = "<option value=''>Seleccione una Opcion...<\/option>";
              $.each(data.asignaturas, function(i,item){
                  options += "<option value='"+item.codigo+"'>"+item.nombre+"</option>";
              });
              $("#asignaturaSel").html(options);
          }
          if(data!=null && data.editoriales!=null){
              var edOptions = "<option value=''>Seleccione una Opcion...<\/option>";
              $.each(data.editoriales, function(j,item){
                  edOptions += "<option value='"+item.codigo+"'>"+item.nombre+"</option>";
              });
              $("#editorialSel").html(edOptions);
          }
        },
        error: function(){
          alert('error!');
        }
      });
  }
});

