FROM mysql/mysql-server:8.0.32

MAINTAINER lengleng(wangiegie@gmail.com)

ENV TZ=Asia/Shanghai

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY ./musi.sql /docker-entrypoint-initdb.d

COPY ./musi_codegen.sql /docker-entrypoint-initdb.d

COPY ./musi_config.sql /docker-entrypoint-initdb.d

COPY ./musi_job.sql /docker-entrypoint-initdb.d

EXPOSE 3306
