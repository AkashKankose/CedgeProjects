$(document).ready(function() {

    /********** bootstrap datepicker **************/
      $(function() {
          $("#datepicker_first").datepicker({
            autoclose: true,
            startDate : '+3d',
            format: 'dd-mm-yyyy',
            
            todayHighlight: true
          }).on('changeDate', function(ev){
                var date = $(this).datepicker('getDate');
                date.setDate(date.getDate() + 1);
              //$( "#datepicker_last" ).datepicker("setStartDate", date);
          });
        });
        
        $(function() {
          /*$("#datepicker_last").datepicker({
            autoclose: true,
            startDate: '-0m',
            format: 'dd-mm-yyyy',
            todayHighlight: true
          }).datepicker();*/
        });
  
    /********** end bootstrap datepicker **************/
  
    /********** code for select card **************/
    $('.region .card').bind('click', function() {
      $(".region .card").removeClass("active");
      $(this).addClass("active");
    });
    /********** end code for select card **************/
  
    /********** for custom dropdown **************/
    $('.dropdown-bank').click(function(e) {
      e.preventDefault();
      e.stopPropagation();
      $(this).toggleClass('expanded');
      $('#' + $(e.target).attr('for')).prop('checked', true);
    });
    $(document).click(function() {
      $('.dropdown-bank').removeClass('expanded');
    });
  
  
    $('.dropdown_acc_type').click(function(e) {
      e.preventDefault();
      e.stopPropagation();
      $(this).toggleClass('expanded');
      $('#' + $(e.target).attr('for')).prop('checked', true);
    });
    $(document).click(function() {
      $('.dropdown_acc_type').removeClass('expanded');
    });
  
  
    $('.dropdown_collection_type').click(function(e) {
      e.preventDefault();
      e.stopPropagation();
      $(this).toggleClass('expanded');
      $('#' + $(e.target).attr('for')).prop('checked', true);
    });
    $(document).click(function() {
      $('.dropdowncollection_type').removeClass('expanded');
    });
  
      $('.dropdown_collection_freq').click(function(e) {
        e.preventDefault();
        e.stopPropagation();
        $(this).toggleClass('expanded');
        $('#' + $(e.target).attr('for')).prop('checked', true);
      });
      $(document).click(function() {
        $('.dropdown_collection_freq').removeClass('expanded');
      });
  
      $('.dropdown_create_mandate').click(function(e) {
        e.preventDefault();
        e.stopPropagation();
        $(this).toggleClass('expanded');
        $('#' + $(e.target).attr('for')).prop('checked', true);
      });
      $(document).click(function() {
        $('.dropdown_create_cmandate').removeClass('expanded');
      });
      
      $('.payment-select').on('click', function(){
          $(this).toggleClass('active')
      })
        //for payment type
      $('.payment-select ul li').on('click', function() {
          var v = $(this).text();
          $('.payment-select ul li').not($(this)).removeClass('active');
          $(this).addClass('active');
          $('.payment-select label button').text(v)
      })
    /********** end custom dropdown **************/
  
    /********** for input box empty **************/
    $( "#search_mob_no" ).focus(function() {
      $("#search_acc_no").val(null);
    });
  
    $( "#search_acc_no" ).focus(function() {
      $("#search_mob_no").val(null);
  
    });
    /********** end code for input box empty **************/
  
    /********** for search **************/
    $('#search').on('click',function(){
      var mobile_input_val = $("#search_mob_no").val();
        var acc_input_val = $("#search_acc_no").val();
  
          if( mobile_input_val!=""){
  document.getElementById('result_mob_text_value').innerHTML =   mobile_input_val;
  $(".tab-pane").removeClass("active");
  $("input[type='radio']").prop("checked", false);
        $(".radio_for_mob").css("display","block");
        $(".radio_for_acc").css("display","none");
          }
  
  
           if( acc_input_val!=""){
             document.getElementById('result_acc_text_value').innerHTML =   acc_input_val;
               $(".tab-pane").removeClass("active");
               $("#accont1").addClass("active");
               $("#test1").prop("checked", true);
          $(".radio_for_acc").css("display","block");
          $(".radio_for_mob").css("display","none");
          }
  
      });
    /********** end code for search **************/
  
    /********** code for radio button selection **************/
    $("#test1").change(function() {
        $(".tab-pane").removeClass("active");
      $("#accont1").addClass("active");
  
    });
  
    $("#m_test1").change(function() {
        $(".tab-pane").removeClass("active");
      $("#m_accont1").addClass("active");
  
    });
  
    $("#m_test2").change(function() {
        $(".tab-pane").removeClass("active");
      $("#m_accont2").addClass("active");
  
    });
  
    $("#m_test3").change(function() {
        $(".tab-pane").removeClass("active");
      $("#m_accont3").addClass("active");
  
    });
      /********** end code for radio button selection **************/
  
  
      $('.back-btn').on('click',function(){
        $(".tab-pane").removeClass("active");
        $("input[type='radio']").prop("checked", false);
        $("#search_mob_no").val(null);
        $("#search_acc_no").val(null);
        $(".radio_for_mob").css("display","none");
        $(".radio_for_acc").css("display","none");
  
      });
      $('.bank-select').on('click', function(){
        $(this).toggleClass('active')
      })
      
      $('.bank-select ul li').on('click', function() {
        var v = $(this).text();
        $('.bank-select ul li').not($(this)).removeClass('active');
        $(this).addClass('active');
        $('.bank-select label button').text(v)
      })
  
  
     
  
      $('.ammount-type').on('click', function(){
        $(this).toggleClass('active')
      })
  
      $('.ammount-type  ul li').on('click', function() {
        var v = $(this).text();
        $('.ammount-type ul li').not($(this)).removeClass('active');
        $(this).addClass('active');
        $('.ammount-type label button').text(v);
        console.log("wrtwtwy");
      })
  
      $('.payment-select').on('click', function(){
        $(this).toggleClass('active')
      })
  
      $('.payment-select ul li').on('click', function() {
        var v = $(this).text();
        $('.create-mandate ul li').not($(this)).removeClass('active');
        $(this).addClass('active');
        $('.create-mandate label button').text(v);
        console.log("wrtwtwy");
      })
      $('.collection-type').on('click', function(){
        $(this).toggleClass('active')
      })
  
      $('.collection-type ul li').on('click', function() {
        var v = $(this).text();
        $('.collection-type ul li').not($(this)).removeClass('active');
        $(this).addClass('active');
        $('.collection-type label button').text(v)
      })
      
  
  
      $('.collection-freq').on('click', function(){
        $(this).toggleClass('active')
      })
  
      $('.collection-freq ul li').on('click', function() {
        var v = $(this).text();
        $('.collection-freq ul li').not($(this)).removeClass('active');
        $(this).addClass('active');
        $('.collection-freq label button').text(v)
      })
      
  
      $(function () {
        $("#chkPassport").click(function () {
            if ($(this).is(":checked")) {
    
                $(".cta").addClass('activate');
            } else {
    
                $(".cta").removeClass('activate');
            }
        });
    });
      
      $('.payment-select').on('click', function(){
          $(this).toggleClass('active')
      })
        //for payment type
      $('.payment-select ul li').on('click', function() {
          var v = $(this).text();
          $('.payment-select ul li').not($(this)).removeClass('active');
          $(this).addClass('active');
          $('.payment-select label button').text(v)
      })
      
      //For Account Type
      $('.accountType-select').on('click', function(){
          $(this).toggleClass('active')
      })
        
      $('.accountType-select ul li').on('click', function() {
          var v = $(this).text();
          $('.accountType-select ul li').not($(this)).removeClass('active');
          $(this).addClass('active');
          $('.accountType-select label button').text(v)
      })
      });