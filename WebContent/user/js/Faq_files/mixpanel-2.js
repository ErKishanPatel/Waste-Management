(function() {
var n=!0,q=null,t=!1;function C(){return function(){}}
(function(s){function k(){}function g(){}function E(a,c,d){var f,e="mixpanel"===d?s:s[d];if(e&&!b.isArray(e))p.error("You have already initialized "+d);else return f=new g,f.K(a,c,d),f.people=new k,f.people.K(f),A=A||f.d("debug"),b.e(e)||(f.H.call(f.people,e.people),f.H(e)),f}function l(a){this.props={};this.ca=t;this.name=a.cookie_name?"mp_"+a.cookie_name:"mp_"+a.token+"_mixpanel";this.load();this.va(a);this.cb(a);this.save()}function F(){this.pa="submit"}function B(){this.pa="click"}function w(){}
function x(){if(!x.Ia)K=x.Ia=n,L=t,b.a(y,function(a){a.za()})}var J=Array.prototype,z=Object.prototype,M=J.slice,D=z.toString,G=z.hasOwnProperty,u=window.console,H=window.navigator,r=window.document,v=H.userAgent,O=["__mps","__mpa","__mpap","$people_distinct_id"],z=s&&s.__SV||0,I=window.XMLHttpRequest&&"withCredentials"in new XMLHttpRequest,L=!I&&-1==v.indexOf("MSIE"),b={},A=t,P={api_host:("https:"==r.location.protocol?"https://":"http://")+"api.mixpanel.com",cross_subdomain_cookie:n,cookie_name:"",
loaded:C(),store_google:n,save_referrer:n,test:t,verbose:t,img:t,track_pageview:n,debug:t,track_links_timeout:300,cookie_expiration:365,upgrade:t,disable_cookie:t,ip:n},K=t;(function(){var a=J.forEach,c=J.indexOf,d=Array.isArray,f={},e=b.a=function(c,d,b){if(c!=q)if(a&&c.forEach===a)c.forEach(d,b);else if(c.length===+c.length)for(var e=0,g=c.length;e<g&&!(e in c&&d.call(b,c[e],e,c)===f);e++);else for(e in c)if(G.call(c,e)&&d.call(b,c[e],e,c)===f)break};b.extend=function(a){e(M.call(arguments,1),function(c){for(var d in c)void 0!==
c[d]&&(a[d]=c[d])});return a};b.isArray=d||function(a){return"[object Array]"===D.call(a)};b.Pa=function(a){try{return/^\s*\bfunction\b/.test(a)}catch(c){return t}};b.Na=function(a){return!(!a||!G.call(a,"callee"))};b.o=function(a){return!a?[]:a.o?a.o():b.isArray(a)||b.Na(a)?M.call(a):b.fb(a)};b.fb=function(a){var c=[];if(a==q)return c;e(a,function(a){c[c.length]=a});return c};b.hb=function(a){return a};b.ia=function(a,d){var b=t;if(a==q)return b;if(c&&a.indexOf===c)return-1!=a.indexOf(d);e(a,function(a){if(b||
(b=a===d))return f});return b};b.g=function(a,c){return-1!==a.indexOf(c)}})();b.ka=function(a,c){a.prototype=new c;a.Ya=c.prototype};b.h=function(a){return a===Object(a)&&!b.isArray(a)};b.W=function(a){if(b.h(a)){for(var c in a)if(G.call(a,c))return t;return n}return t};b.e=function(a){return void 0===a};b.ma=function(a){return"[object String]"==D.call(a)};b.Oa=function(a){return"[object Date]"==D.call(a)};b.Qa=function(a){return"[object Number]"==D.call(a)};b.ga=function(a){b.a(a,function(c,d){b.Oa(c)?
a[d]=b.Ja(c):b.h(c)&&(a[d]=b.ga(c))});return a};b.Ja=function(a){function c(a){return 10>a?"0"+a:a}return a.getUTCFullYear()+"-"+c(a.getUTCMonth()+1)+"-"+c(a.getUTCDate())+"T"+c(a.getUTCHours())+":"+c(a.getUTCMinutes())+":"+c(a.getUTCSeconds())};b.B=function(a){var c={};b.a(a,function(a,f){b.ma(a)&&0<a.length&&(c[f]=a)});return c};b.truncate=function(a,c){var d;"string"===typeof a?d=a.slice(0,c):b.isArray(a)?(d=[],b.a(a,function(a){d.push(b.truncate(a,c))})):b.h(a)?(d={},b.a(a,function(a,e){d[e]=
b.truncate(a,c)})):d=a;return d};b.q=function(){return function(a){function c(a,b){var i="",j=0,h=j="",h=0,g=i,m=[],o=b[a];o&&"object"===typeof o&&"function"===typeof o.toJSON&&(o=o.toJSON(a));switch(typeof o){case "string":return d(o);case "number":return isFinite(o)?""+o:"null";case "boolean":case "null":return""+o;case "object":if(!o)return"null";i+="    ";m=[];if("[object Array]"===D.apply(o)){h=o.length;for(j=0;j<h;j+=1)m[j]=c(j,o)||"null";return h=0===m.length?"[]":i?"[\n"+i+m.join(",\n"+i)+
"\n"+g+"]":"["+m.join(",")+"]"}for(j in o)G.call(o,j)&&(h=c(j,o))&&m.push(d(j)+(i?": ":":")+h);return h=0===m.length?"{}":i?"{"+m.join(",")+""+g+"}":"{"+m.join(",")+"}"}}function d(a){var c=/[\\\"\x00-\x1f\x7f-\x9f\u00ad\u0600-\u0604\u070f\u17b4\u17b5\u200c-\u200f\u2028-\u202f\u2060-\u206f\ufeff\ufff0-\uffff]/g,d={"\u0008":"\\b","\t":"\\t","\n":"\\n","\u000c":"\\f","\r":"\\r",'"':'\\"',"\\":"\\\\"};c.lastIndex=0;return c.test(a)?'"'+a.replace(c,function(a){var c=d[a];return"string"===typeof c?c:"\\u"+
("0000"+a.charCodeAt(0).toString(16)).slice(-4)})+'"':'"'+a+'"'}return c("",{"":a})}}();b.C=function(){function a(){switch(h){case "t":return e("t"),e("r"),e("u"),e("e"),n;case "f":return e("f"),e("a"),e("l"),e("s"),e("e"),t;case "n":return e("n"),e("u"),e("l"),e("l"),q}i("Unexpected '"+h+"'")}function c(){for(;h&&" ">=h;)e()}function d(){var a,c,d="",b;if('"'===h)for(;e();){if('"'===h)return e(),d;if("\\"===h)if(e(),"u"===h){for(c=b=0;4>c;c+=1){a=parseInt(e(),16);if(!isFinite(a))break;b=16*b+a}d+=
String.fromCharCode(b)}else if("string"===typeof g[h])d+=g[h];else break;else d+=h}i("Bad string")}function b(){var a;a="";"-"===h&&(a="-",e("-"));for(;"0"<=h&&"9">=h;)a+=h,e();if("."===h)for(a+=".";e()&&"0"<=h&&"9">=h;)a+=h;if("e"===h||"E"===h){a+=h;e();if("-"===h||"+"===h)a+=h,e();for(;"0"<=h&&"9">=h;)a+=h,e()}a=+a;if(isFinite(a))return a;i("Bad number")}function e(a){a&&a!==h&&i("Expected '"+a+"' instead of '"+h+"'");h=m.charAt(j);j+=1;return h}function i(a){throw{name:"SyntaxError",message:a,
gb:j,text:m};}var j,h,g={'"':'"',"\\":"\\","/":"/",b:"\u0008",f:"\u000c",n:"\n",r:"\r",t:"\t"},m,o;o=function(){c();switch(h){case "{":var j;a:{var g,m={};if("{"===h){e("{");c();if("}"===h){e("}");j=m;break a}for(;h;){g=d();c();e(":");Object.hasOwnProperty.call(m,g)&&i('Duplicate key "'+g+'"');m[g]=o();c();if("}"===h){e("}");j=m;break a}e(",");c()}}i("Bad object")}return j;case "[":a:{j=[];if("["===h){e("[");c();if("]"===h){e("]");g=j;break a}for(;h;){j.push(o());c();if("]"===h){e("]");g=j;break a}e(",");
c()}}i("Bad array")}return g;case '"':return d();case "-":return b();default:return"0"<=h&&"9">=h?b():a()}};return function(a){m=a;j=0;h=" ";a=o();c();h&&i("Syntax error");return a}}();b.ba=function(a){var c,d,f,e,i=0,j=0,h="",h=[];if(!a)return a;a=b.eb(a);do c=a.charCodeAt(i++),d=a.charCodeAt(i++),f=a.charCodeAt(i++),e=c<<16|d<<8|f,c=e>>18&63,d=e>>12&63,f=e>>6&63,e&=63,h[j++]="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(c)+"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(d)+
"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(f)+"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(e);while(i<a.length);h=h.join("");switch(a.length%3){case 1:h=h.slice(0,-2)+"==";break;case 2:h=h.slice(0,-1)+"="}return h};b.eb=function(a){var a=(a+"").replace(/\r\n/g,"\n").replace(/\r/g,"\n"),c="",d,b,e=0,i;d=b=0;e=a.length;for(i=0;i<e;i++){var j=a.charCodeAt(i),h=q;128>j?b++:h=127<j&&2048>j?String.fromCharCode(j>>6|192,j&63|128):String.fromCharCode(j>>
12|224,j>>6&63|128,j&63|128);h!==q&&(b>d&&(c+=a.substring(d,b)),c+=h,d=b=i+1)}b>d&&(c+=a.substring(d,a.length));return c};b.ya=function(){function a(){function a(c,b){var d,e=0;for(d=0;d<b.length;d++)e|=i[d]<<8*d;return c^e}var c,b,i=[],j=0;for(c=0;c<v.length;c++)b=v.charCodeAt(c),i.unshift(b&255),4<=i.length&&(j=a(j,i),i=[]);0<i.length&&(j=a(j,i));return j.toString(16)}function c(){for(var a=1*new Date,c=0;a==1*new Date;)c++;return a.toString(16)+c.toString(16)}return function(){var b=(screen.height*
screen.width).toString(16);return c()+"-"+Math.random().toString(16).replace(".","")+"-"+a()+"-"+b+"-"+c()}}();b.la=function(a){return/(google web preview|baiduspider|yandexbot|bingbot|googlebot|yahoo! slurp)/i.test(a)?n:t};b.xa=function(a){var c,d,f,e=[];"undefined"===typeof c&&(c="&");b.a(a,function(a,c){d=encodeURIComponent(a.toString());f=encodeURIComponent(c);e[e.length]=f+"="+d});return e.join(c)};b.ha=function(a,c){var c=c.replace(/[\[]/,"\\[").replace(/[\]]/,"\\]"),b=RegExp("[\\?&]"+c+"=([^&#]*)").exec(a);
return b===q||b&&"string"!==typeof b[1]&&b[1].length?"":decodeURIComponent(b[1]).replace(/\+/g," ")};b.cookie={get:function(a){for(var a=a+"=",c=r.cookie.split(";"),b=0;b<c.length;b++){for(var f=c[b];" "==f.charAt(0);)f=f.substring(1,f.length);if(0==f.indexOf(a))return decodeURIComponent(f.substring(a.length,f.length))}return q},parse:function(a){var c;try{c=b.C(b.cookie.get(a))||{}}catch(d){}return c},set:function(a,c,b,f){var d;var e="",i="";f&&(d=(e=(e=r.location.hostname.match(/[a-z0-9][a-z0-9\-]+\.[a-z\.]{2,6}$/i))?
e[0]:"")?"; domain=."+e:"",e=d);b&&(i=new Date,i.setTime(i.getTime()+864E5*b),i="; expires="+i.toGMTString());r.cookie=a+"="+encodeURIComponent(c)+i+"; path=/"+e},remove:function(a,c){b.cookie.set(a,"",-1,c)}};b.ra=function(){function a(a,f,e){return function(i){if(i=i||c(window.event)){var j=n,h;b.Pa(e)&&(h=e(i));i=f.call(a,i);if(t===h||t===i)j=t;return j}}}function c(a){if(a)a.preventDefault=c.preventDefault,a.stopPropagation=c.stopPropagation;return a}c.preventDefault=function(){this.returnValue=
t};c.stopPropagation=function(){this.cancelBubble=n};return function(c,b,e,i){c?c.addEventListener&&!i?c.addEventListener(b,e,t):(b="on"+b,c[b]=a(c,e,c[b])):p.error("No valid element provided to register_event")}}();b.Ha=function(){function a(a,b){return 0<=(" "+a.className+" ").replace(c," ").indexOf(" "+b+" ")}var c=/[\t\r\n]/g;return function(c){if(!r.getElementsByTagName)return[];for(var c=c.split(" "),f,e=Array(r),i=0;i<c.length;i++)if(f=c[i].replace(/^\s+/,"").replace(/\s+$/,""),-1<f.indexOf("#")){f=
f.split("#");var j=f[0],e=r.getElementById(f[1]);if(!e||j&&e.nodeName.toLowerCase()!=j)return[];e=Array(e)}else if(-1<f.indexOf(".")){f=f.split(".");var j=f[0],h=f[1];j||(j="*");f=[];for(var g=0,m=0;m<e.length;m++){var o;o="*"==j?e[m].all?e[m].all:e[m].getElementsByTagName("*"):e[m].getElementsByTagName(j);for(var k=0;k<o.length;k++)f[g++]=o[k]}e=[];for(g=j=0;g<f.length;g++)f[g].className&&b.ma(f[g].className)&&a(f[g],h)&&(e[j++]=f[g])}else if(f.match(/^(\w*)\[(\w+)([=~\|\^\$\*]?)=?"?([^\]"]*)"?\]$/)){var j=
RegExp.$1,l=RegExp.$2,h=RegExp.$3,p=RegExp.$4;j||(j="*");f=[];for(m=g=0;m<e.length;m++){o="*"==j?e[m].all?e[m].all:e[m].getElementsByTagName("*"):e[m].getElementsByTagName(j);for(k=0;k<o.length;k++)f[g++]=o[k]}e=[];j=0;switch(h){case "=":h=function(a){return a.getAttribute(l)==p};break;case "~":h=function(a){return a.getAttribute(l).match(RegExp("\\b"+p+"\\b"))};break;case "|":h=function(a){return a.getAttribute(l).match(RegExp("^"+p+"-?"))};break;case "^":h=function(a){return 0==a.getAttribute(l).indexOf(p)};
break;case "$":h=function(a){return a.getAttribute(l).lastIndexOf(p)==a.getAttribute(l).length-p.length};break;case "*":h=function(a){return-1<a.getAttribute(l).indexOf(p)};break;default:h=function(a){return a.getAttribute(l)}}e=[];for(g=j=0;g<f.length;g++)h(f[g])&&(e[j++]=f[g])}else{j=f;f=[];for(m=g=0;m<e.length;m++){o=e[m].getElementsByTagName(j);for(k=0;k<o.length;k++)f[g++]=o[k]}e=f}return e}}();b.info={Da:function(){var a="",c={};b.a("utm_source utm_medium utm_campaign utm_content utm_term".split(" "),
function(d){a=b.ha(r.URL,d);a.length&&(c[d]=a)});return c},Ua:function(a){return 0===a.search("https?://(.*)google.([^/?]*)")?"google":0===a.search("https?://(.*)bing.com")?"bing":0===a.search("https?://(.*)yahoo.com")?"yahoo":0===a.search("https?://(.*)duckduckgo.com")?"duckduckgo":q},Va:function(a){var c=b.info.Ua(a),d={};if(c!==q)d.$search_engine=c,a=b.ha(a,"yahoo"!=c?"q":"p"),a.length&&(d.mp_keyword=a);return d},w:function(a,c,d){c=c||"";return d?b.g(a,"Mini")?"Opera Mini":"Opera":/(BlackBerry|PlayBook|BB10)/i.test(a)?
"BlackBerry":b.g(a,"FBIOS")?"Facebook Mobile":b.g(a,"Chrome")?"Chrome":b.g(a,"CriOS")?"Chrome iOS":b.g(c,"Apple")?b.g(a,"Mobile")?"Mobile Safari":"Safari":b.g(a,"Android")?"Android Mobile":b.g(a,"Konqueror")?"Konqueror":b.g(a,"Firefox")?"Firefox":b.g(a,"MSIE")||b.g(a,"Trident/")?"Internet Explorer":b.g(a,"Gecko")?"Mozilla":""},X:function(){return/Windows/i.test(v)?/Phone/.test(v)?"Windows Mobile":"Windows":/(iPhone|iPad|iPod)/.test(v)?"iOS":/Android/.test(v)?"Android":/(BlackBerry|PlayBook|BB10)/i.test(v)?
"BlackBerry":/Mac/i.test(v)?"Mac OS X":/Linux/.test(v)?"Linux":""},fa:function(a){return/iPad/.test(a)?"iPad":/iPod/.test(a)?"iPod Touch":/iPhone/.test(a)?"iPhone":/(BlackBerry|PlayBook|BB10)/i.test(a)?"BlackBerry":/Windows Phone/i.test(a)?"Windows Phone":/Android/.test(a)?"Android":""},qa:function(a){a=a.split("/");return 3<=a.length?a[2]:""},A:function(){return b.extend(b.B({$os:b.info.X(),$browser:b.info.w(v,H.vendor,window.opera),$referrer:r.referrer,$referring_domain:b.info.qa(r.referrer),$device:b.info.fa(v)}),
{$screen_height:screen.height,$screen_width:screen.width,mp_lib:"web"})},Ta:function(){return b.B({$os:b.info.X(),$browser:b.info.w(v,H.vendor,window.opera)})},Sa:function(a){return b.B({mp_page:a,mp_referrer:r.referrer,mp_browser:b.info.w(v,H.vendor,window.opera),mp_platform:b.info.X()})}};var p={log:function(){if(A&&!b.e(u)&&u)try{u.log.apply(u,arguments)}catch(a){b.a(arguments,function(a){u.log(a)})}},error:function(){if(A&&!b.e(u)&&u){var a=["Mixpanel error:"].concat(b.o(arguments));try{u.error.apply(u,
a)}catch(c){b.a(a,function(a){u.error(a)})}}},da:function(){if(!b.e(u)&&u){var a=["Mixpanel error:"].concat(b.o(arguments));try{u.error.apply(u,a)}catch(c){b.a(a,function(a){u.error(a)})}}}};w.prototype.z=C();w.prototype.R=C();w.prototype.P=C();w.prototype.V=function(a){this.na=a;return this};w.prototype.p=function(a,c,d,f){var e=this,i=b.Ha(a);if(0==i.length)p.error("The DOM query ("+a+") returned 0 elements");else return b.a(i,function(a){b.ra(a,this.pa,function(a){var b={},i=e.z(d,this),g=e.na.d("track_links_timeout");
e.R(a,this,b);window.setTimeout(e.ta(f,i,b,n),g);e.na.p(c,i,e.ta(f,i,b))})},this),n};w.prototype.ta=function(a,c,b,f){var f=f||t,e=this;return function(){if(!b.Ca)b.Ca=n,a&&a(f,c)===t||e.P(c,b,f)}};w.prototype.z=function(a,c){return"function"===typeof a?a(c):b.extend({},a)};b.ka(B,w);B.prototype.z=function(a,c){var b=B.Ya.z.apply(this,arguments);if(c.href)b.url=c.href;return b};B.prototype.R=function(a,c,b){b.oa=2===a.which||a.metaKey||"_blank"===c.target;b.href=c.href;b.oa||a.preventDefault()};B.prototype.P=
function(a,c){c.oa||setTimeout(function(){window.location=c.href},0)};b.ka(F,w);F.prototype.R=function(a,c,b){b.element=c;a.preventDefault()};F.prototype.P=function(a,c){setTimeout(function(){c.element.submit()},0)};l.prototype.A=function(){var a={};b.a(this.props,function(c,d){b.ia(O,d)||(a[d]=c)});return a};l.prototype.load=function(){if(!this.disabled){var a=b.cookie.parse(this.name);a&&(this.props=b.extend({},a))}};l.prototype.cb=function(a){var c=a.upgrade,d;if(c)d="mp_super_properties","string"===
typeof c&&(d=c),c=b.cookie.parse(d),b.cookie.remove(d),b.cookie.remove(d,n),c&&(this.props=b.extend(this.props,c.all,c.events));if(!a.cookie_name&&"mixpanel"!==a.name&&(d="mp_"+a.token+"_"+a.name,c=b.cookie.parse(d)))b.cookie.remove(d),b.cookie.remove(d,n),this.j(c)};l.prototype.save=function(){this.disabled||b.cookie.set(this.name,b.q(this.props),this.S,this.Q)};l.prototype.remove=function(){b.cookie.remove(this.name,t);b.cookie.remove(this.name,n)};l.prototype.clear=function(){this.remove();this.props=
{}};l.prototype.j=function(a,c,d){return b.h(a)?("undefined"===typeof c&&(c="None"),this.S="undefined"===typeof d?this.ea:d,b.a(a,function(a,b){if(!this.props[b]||this.props[b]===c)this.props[b]=a},this),this.save(),n):t};l.prototype.m=function(a,c){return b.h(a)?(this.S="undefined"===typeof c?this.ea:c,b.extend(this.props,a),this.save(),n):t};l.prototype.Y=function(a){a in this.props&&(delete this.props[a],this.save())};l.prototype.bb=function(){if(!this.ca)this.j(b.info.Da()),this.ca=n};l.prototype.wa=
function(a){this.m(b.info.Va(a))};l.prototype.Z=function(a){this.j({$initial_referrer:a||"$direct",$initial_referring_domain:b.info.qa(a)||"$direct"},"")};l.prototype.La=function(){return b.B({$initial_referrer:this.props.$initial_referrer,$initial_referring_domain:this.props.$initial_referring_domain})};l.prototype.va=function(a){this.ea=this.S=a.cookie_expiration;this.Xa(a.disable_cookie);this.Wa(a.cross_subdomain_cookie)};l.prototype.Xa=function(a){(this.disabled=a)&&this.remove()};l.prototype.Wa=
function(a){if(a!==this.Q)this.Q=a,this.remove(),this.save()};l.prototype.Ka=function(){return this.Q};l.prototype.k=function(a,c){var d=this.J(a),f=c[a],e=this.I("$set"),i=this.I("$add"),g=this.I("$append",[]);"__mps"===d?(b.extend(e,f),this.M("$add",f)):"__mpa"===d?b.a(f,function(a,b){b in e?e[b]+=a:(b in i||(i[b]=0),i[b]+=a)},this):"__mpap"===d&&g.push(f);p.log("MIXPANEL PEOPLE REQUEST (QUEUED, PENDING IDENTIFY):");p.log(c);this.save()};l.prototype.M=function(a,c){var d=this.v(a);b.e(d)||(b.a(c,
function(a,b){delete d[b]},this),this.save())};l.prototype.J=function(a){if("$set"===a)return"__mps";if("$add"===a)return"__mpa";if("$append"===a)return"__mpap";p.error("Invalid queue:",a)};l.prototype.v=function(a){return this.props[this.J(a)]};l.prototype.I=function(a,c){var d=this.J(a),c=b.e(c)?{}:c;return this.props[d]||(this.props[d]=c)};g.prototype.V=function(a,b,d){if("undefined"===typeof d)p.error("You must name your new library: init(token, config, name)");else if("mixpanel"===d)p.error("You must initialize the main mixpanel object right after you include the Mixpanel js snippet");
else return a=E(a,b,d),s[d]=a,a.L(),a};g.prototype.K=function(a,c,d){this.__loaded=n;this.config={};this.sa(b.extend({},P,c,{name:d,token:a,callback_fn:("mixpanel"===d?d:"mixpanel."+d)+"._jsc"}));this._jsc=C();this.F=[];this.G=[];this.D=[];this.s={disable_all_events:t,identify_called:t};this.cookie=new l(this.config)};g.prototype.L=function(){this.d("loaded")(this);this.d("track_pageview")&&this.ua()};g.prototype.za=function(){b.a(this.F,function(a){this.O.apply(this,a)},this);b.a(this.G,function(a){this.i.apply(this,
a)},this);delete this.F;delete this.G};g.prototype.O=function(a,b){if(this.d("img"))return p.error("You can't use DOM tracking functions with img = true."),t;if(!K)return this.F.push([a,b]),t;var d=(new a).V(this);return d.p.apply(d,b)};g.prototype.aa=function(a,c){if(b.e(a))return q;if(I)return function(b){a(b,c)};var d=this._jsc,f=""+Math.floor(1E8*Math.random()),e=this.d("callback_fn")+'["'+f+'"]';d[f]=function(b){delete d[f];a(b,c)};return e};g.prototype.i=function(a,c,d){if(L)this.G.push(arguments);
else{var f=this.d("verbose");this.d("test")&&(c.test=1);f&&(c.verbose=1);this.d("img")&&(c.img=1);if(!I)if(d)c.callback=d;else if(f||this.d("test"))c.callback="(function(){})";c.ip=this.d("ip")?1:0;c._=(new Date).getTime().toString();a+="?"+b.xa(c);if("img"in c){var e=r.createElement("img");e.src=a;r.body.appendChild(e)}else if(I){var i=new XMLHttpRequest;i.open("GET",a,n);i.withCredentials=n;i.onreadystatechange=function(){if(4===i.readyState)if(200===i.status)d&&(f?d(b.C(i.responseText)):d(Number(i.responseText)));
else{var a="Bad HTTP status: "+i.status+" "+i.statusText;p.error(a);d&&(f?d({status:0,error:a}):d(0))}};i.send(q)}else{e=r.createElement("script");e.type="text/javascript";e.async=n;e.defer=n;e.src=a;var g=r.getElementsByTagName("script")[0];g.parentNode.insertBefore(e,g)}}};g.prototype.H=function(a){function c(a,c){b.a(a,function(a){this[a[0]].apply(this,a.slice(1))},c)}var d,f=[],e=[];b.a(a,function(a){a&&(d=a[0],"function"===typeof a?a.call(this):b.isArray(a)&&-1!=d.indexOf("track")&&"function"===
typeof this[d]?e.push(a):f.push(a))},this);c(f,this);c(e,this)};g.prototype.push=function(a){this.H([a])};g.prototype.disable=function(a){"undefined"===typeof a?this.s.Ga=n:this.D=this.D.concat(a)};g.prototype.p=function(a,c,d){if("undefined"===typeof a)p.error("No event name provided to mixpanel.track");else if(b.la(v)||this.s.Ga||b.ia(this.D,a))"undefined"!==typeof d&&d(0);else return c=c||{},c.token=c.ib||this.d("token"),this.j({distinct_id:b.ya()},""),this.cookie.wa(r.referrer),this.d("store_google")&&
this.cookie.bb(),this.d("save_referrer")&&this.cookie.Z(r.referrer),c=b.extend({},b.info.A(),this.cookie.A(),c),a=b.truncate({event:a,properties:c},255),c=b.q(a),c=b.ba(c),p.log("MIXPANEL REQUEST:"),p.log(a),this.i(this.d("api_host")+"/track/",{data:c},this.aa(d,a)),a};g.prototype.ua=function(a){if("undefined"===typeof a)a=r.location.href;this.p("mp_page_view",b.info.Sa(a))};g.prototype.ab=function(){return this.O.call(this,B,arguments)};g.prototype.$a=function(){return this.O.call(this,F,arguments)};
g.prototype.m=function(a,b){this.cookie.m(a,b)};g.prototype.j=function(a,b,d){this.cookie.j(a,b,d)};g.prototype.Y=function(a){this.cookie.Y(a)};g.prototype.N=function(a,b){var d={};d[a]=b;this.m(d)};g.prototype.U=function(a){this.N("distinct_id",a)};g.prototype.l=function(){return this.T("distinct_id")};g.prototype.Ra=function(a){this.N("mp_name_tag",a)};g.prototype.sa=function(a){b.h(a)&&(b.extend(this.config,a),this.cookie&&this.cookie.va(this.config),A=A||this.d("debug"))};g.prototype.d=function(a){return this.config[a]};
g.prototype.T=function(a){return this.cookie.props[a]};g.prototype.toString=function(){var a=this.d("name");"mixpanel"!==a&&(a="mixpanel."+a);return a};k.prototype.K=function(a){this.c=a};k.prototype.U=function(a,c,d,f){var e=this.c.l();!b.e(e)&&e!==q&&e!==a&&this.set({$events_distinct_id:e});this.c.s.Ma=n;this.c.N("$people_distinct_id",a);this.Ba(c,d,f)};k.prototype.set=function(a,c,d){var f={},e={};b.h(a)?(b.a(a,function(a,b){"$distinct_id"==b||"$token"==b||(e[b]=a)}),d=c):e[a]=c;this.u("save_referrer")&&
this.c.cookie.Z(r.referrer);e=b.extend({},b.info.Ta(),this.c.cookie.La(),e);f.$set=e;return this.i(f,d)};k.prototype.ja=function(a,c,d){var f={},e={};b.h(a)?(b.a(a,function(a,b){"$distinct_id"==b||"$token"==b||(isNaN(parseFloat(a))?p.error("Invalid increment value passed to mixpanel.people.increment - must be a number"):e[b]=a)}),d=c):(b.e(c)&&(c=1),e[a]=c);f.$add=e;return this.i(f,d)};k.prototype.append=function(a,c,d){var f={},e={};b.h(a)?(b.a(a,function(a,b){"$distinct_id"==b||"$token"==b||(e[b]=
a)}),d=c):e[a]=c;f.$append=e;return this.i(f,d)};k.prototype.Za=function(a,c,d){if(!b.Qa(a)&&(a=parseFloat(a),isNaN(a))){p.error("Invalid value passed to mixpanel.people.track_charge - must be a number");return}return this.append("$transactions",b.extend({$amount:a},c),d)};k.prototype.Ea=function(a){return this.set("$transactions",[],a)};k.prototype.Fa=function(){if(this.$())return this.i({$delete:this.l()});p.error("mixpanel.people.delete_user() requires you to call identify() first")};k.prototype.toString=
function(){return this.c.toString()+".people"};k.prototype.i=function(a,c){a.$token=this.u("token");a.$distinct_id=this.l();var d=b.ga(a),f=b.truncate(d,255),d=b.q(d),d=b.ba(d);if(!this.$())return this.Aa(a),b.e(c)||(this.u("verbose")?c({status:-1,error:q}):c(-1)),f;p.log("MIXPANEL PEOPLE REQUEST:");p.log(f);this.c.i(this.u("api_host")+"/engage/",{data:d},this.c.aa(c,f));return f};k.prototype.u=function(a){return this.c.d(a)};k.prototype.$=function(){return this.c.s.Ma===n};k.prototype.l=function(){return this.c.T("$people_distinct_id")};
k.prototype.Aa=function(a){"$set"in a?this.c.cookie.k("$set",a):"$add"in a?this.c.cookie.k("$add",a):"$append"in a?this.c.cookie.k("$append",a):p.error("Invalid call to _enqueue():",a)};k.prototype.Ba=function(a,c,d){var f=this,e=b.extend({},this.c.cookie.v("$set")),g=b.extend({},this.c.cookie.v("$add")),j=this.c.cookie.v("$append");!b.e(e)&&b.h(e)&&!b.W(e)&&(f.c.cookie.M("$set",e),this.set(e,function(c,d){0==c&&f.c.cookie.k("$set",e);b.e(a)||a(c,d)}));!b.e(g)&&b.h(g)&&!b.W(g)&&(f.c.cookie.M("$add",
g),this.ja(g,function(a,d){0==a&&f.c.cookie.k("$add",g);b.e(c)||c(a,d)}));if(!b.e(j)&&b.isArray(j)&&j.length){for(var h=j.length-1;0<=h;h--){var k=j.pop();f.append(k,function(a,c){0==a&&f.c.cookie.k("$append",k);b.e(d)||d(a,c)})}f.c.cookie.save()}};b.toArray=b.o;b.isObject=b.h;b.JSONEncode=b.q;b.JSONDecode=b.C;b.isBlockedUA=b.la;b.isEmptyObject=b.W;b.info=b.info;b.info.device=b.info.fa;b.info.browser=b.info.w;g.prototype.init=g.prototype.V;g.prototype.disable=g.prototype.disable;g.prototype.track=
g.prototype.p;g.prototype.track_links=g.prototype.ab;g.prototype.track_forms=g.prototype.$a;g.prototype.track_pageview=g.prototype.ua;g.prototype.register=g.prototype.m;g.prototype.register_once=g.prototype.j;g.prototype.unregister=g.prototype.Y;g.prototype.identify=g.prototype.U;g.prototype.name_tag=g.prototype.Ra;g.prototype.set_config=g.prototype.sa;g.prototype.get_config=g.prototype.d;g.prototype.get_property=g.prototype.T;g.prototype.get_distinct_id=g.prototype.l;g.prototype.toString=g.prototype.toString;
l.prototype.properties=l.prototype.A;l.prototype.update_search_keyword=l.prototype.wa;l.prototype.update_referrer_info=l.prototype.Z;l.prototype.get_cross_subdomain=l.prototype.Ka;l.prototype.clear=l.prototype.clear;k.prototype.set=k.prototype.set;k.prototype.increment=k.prototype.ja;k.prototype.append=k.prototype.append;k.prototype.track_charge=k.prototype.Za;k.prototype.clear_charges=k.prototype.Ea;k.prototype.delete_user=k.prototype.Fa;k.prototype.identify=k.prototype.U;k.prototype.get_distinct_id=
k.prototype.l;k.prototype.toString=k.prototype.toString;if(b.e(s))p.da("'mixpanel' object not initialized. Ensure you are using the latest version of the Mixpanel JS Library along with the snippet we provide.");else if(s.__loaded||s.config&&s.cookie)p.error("Mixpanel library has already been downloaded at least once.");else if(1.1>z)p.da("Version mismatch; please ensure you're using the latest version of the Mixpanel code snippet.");else{var y={};b.a(s._i,function(a){var c;a&&b.isArray(a)&&(c=a[a.length-
1],a=E.apply(this,a),y[c]=a)});var Q=function(){b.a(y,function(a,b){"mixpanel"!==b&&(s[b]=a)});s._=b};s.init=function(a,b,d){d?s[d]||(s[d]=y[d]=E(a,b,d),s[d].L()):(d=s,y.mixpanel?d=y.mixpanel:a&&(d=E(a,b,"mixpanel")),window.mixpanel=s=d,Q())};s.init();b.a(y,function(a){a.L()});if(r.addEventListener)"complete"==r.readyState?x():r.addEventListener("DOMContentLoaded",x,t);else if(r.attachEvent){r.attachEvent("onreadystatechange",x);z=t;try{z=window.frameElement==q}catch(R){}if(r.documentElement.doScroll&&
z){var N=function(){try{r.documentElement.doScroll("left")}catch(a){setTimeout(N,1);return}x()};N()}}b.ra(window,"load",x,n)}})(window.mixpanel);
})();