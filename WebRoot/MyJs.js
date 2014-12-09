 $(function(){

            $("#submit").click(function(){
                $("span").remove();
                var flag=true;
                if($("input:eq(0)").val()==""){
                   
                    flag=false;
                    $("input:eq(0)").after("<span class='color'> username not null </span>");
                }
                if($("input:eq(1)").val()==""){
                    flag=false;
                    $("input:eq(1)").after("<span class='color'> password not null </span>");
                }
                if($("input:eq(2)").val()==""){
                    flag=false;
                    $("input:eq(2)").after("<span class='color'> repassword not null </span>");
                }
                if($("input:eq(3)").val()==""){
                    flag=false;
                    $("input:eq(3)").after("<span class='color'> age not null </span>");
                }

                if(flag) {

                    if ($("input:eq(0)").val().length < 4 || $("input:eq(0)").val().length > 6) {
//                    alert($("input:eq(0)").val().length);
                        flag = false;
                        $("input:eq(0)").after("<span class='color'> username 4-6 </span>");

                    }
                    if ($("input:eq(1)").val() != $("input:eq(2)").val()) {
                        flag = false;
                        $("input:eq(2)").after("<span class='color'> password not same</span>");

                    }

                    if ($("input:eq(3)").val() < 18) {
                        flag = false;
                        $("input:eq(3)").after("<span class='color'> age should >18</span>");

                    }
                }
                return flag;
            });


        });