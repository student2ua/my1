http://programador.ru/работа-с-maven-tomcat/
В случае, если мы работаем в простых условиях, когда у нас имеется свой apache tomcat-ом установленный на локальном компьютере, то настройка довольно простая.
Нам нужно три файла.
tomcat-users.xml Файл, как правило, находится рядом с другими файлами для настройки сервера: APACHE_TOMCAT_DIR/conf/tomcat-users.xml
settings.xml пользовательский, он находится здесь: ${user.home}/.m2/settings.xml
pom.xml