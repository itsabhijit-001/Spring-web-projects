var btn=document.getElementById("btn");
var info=document.getElementById("data");

btn.addEventListener("click",function()
{
    var ourRequest=new XMLHttpRequest();
    ourRequest.open('GET','https://learnwebcode.github.io/json-example/animals-1.json');
    ourRequest.onload=function()
                      {
                        var ourData=ourRequest.responseText;
                        var myData=JSON.parse(ourRequest.responseText);
                        console.log(ourData);
                         for(i=0;i<myData.length;i++)
                        {
                            let htmlCode="<p>" + myData[i].name+" is a "+myData[i].species+" that likes to eat ";
                            for (var j=0;j<myData[i].foods.likes.length;j++)
                            {
                                htmlCode+=myData[i].foods.likes[j]+" and ";
                            }
                            htmlCode+=" dislikes ";
                            var l=myData[i].foods.dislikes.length;
                            for(var k=0;k<l;k++)
                            {
                                if(l-1==k)
                                {
                                    htmlCode+=myData[i].foods.dislikes[k];
                                }
                                else if(l-2==k)
                                {
                                    htmlCode+=myData[i].foods.dislikes[k]+" and ";
                                }
                                else{
                                    htmlCode+=myData[i].foods.dislikes[k]+" , ";
                                }
                            }
                            htmlCode+="</p>";
                            info.insertAdjacentHTML("beforebegin",htmlCode);   
                        }
                    }
    ourRequest.send();
});