- 月度的碳排量数据
CREATE TABLE t_year_month(

  id BIGINT NOT NULL AUTO_INCREMENT,

  year int ,

  month TINYINT,

  PRIMARY KEY (id)
);



- 碳重量

CREATE TABLE t_carbon_weight(

  id BIGINT NOT NULL AUTO_INCREMENT,

  weight DOUBLE ,

  year_month_id BIGINT,

  submit_status TINYINT(1),

  PRIMARY KEY (id),

  CONSTRAINT carbon_year_month_fk FOREIGN KEY (year_month_id) REFERENCES t_year_month(id)

);

- 查已经填报的

SELECT t_year_month.year , t_year_month.month

  FROM t_year_month , t_carbon_weight

  WHERE t_year_month.id = t_carbon_weight.year_month_id

  GROUP BY year , month

;


INSERT INTO t_year_month (year, month) VALUES (2016,1);
INSERT INTO t_year_month (year, month) VALUES (2016,2);
INSERT INTO t_year_month (year, month) VALUES (2016,3);
INSERT INTO t_year_month (year, month) VALUES (2016,4);
INSERT INTO t_year_month (year, month) VALUES (2016,5);
INSERT INTO t_year_month (year, month) VALUES (2016,6);
INSERT INTO t_year_month (year, month) VALUES (2016,7);
INSERT INTO t_year_month (year, month) VALUES (2016,8);
INSERT INTO t_year_month (year, month) VALUES (2016,9);
INSERT INTO t_year_month (year, month) VALUES (2016,10);
INSERT INTO t_year_month (year, month) VALUES (2016,11);
INSERT INTO t_year_month (year, month) VALUES (2016,12);

INSERT INTO t_year_month (year, month) VALUES (2015,1);
INSERT INTO t_year_month (year, month) VALUES (2015,2);
INSERT INTO t_year_month (year, month) VALUES (2015,3);
INSERT INTO t_year_month (year, month) VALUES (2015,4);
INSERT INTO t_year_month (year, month) VALUES (2015,5);
INSERT INTO t_year_month (year, month) VALUES (2015,6);
INSERT INTO t_year_month (year, month) VALUES (2015,7);
INSERT INTO t_year_month (year, month) VALUES (2015,8);
INSERT INTO t_year_month (year, month) VALUES (2015,9);
INSERT INTO t_year_month (year, month) VALUES (2015,10);
INSERT INTO t_year_month (year, month) VALUES (2015,11);
INSERT INTO t_year_month (year, month) VALUES (2015,12);

INSERT INTO t_year_month (year, month) VALUES (2014,1);
INSERT INTO t_year_month (year, month) VALUES (2014,2);
INSERT INTO t_year_month (year, month) VALUES (2014,3);
INSERT INTO t_year_month (year, month) VALUES (2014,4);
INSERT INTO t_year_month (year, month) VALUES (2014,5);
INSERT INTO t_year_month (year, month) VALUES (2014,6);
INSERT INTO t_year_month (year, month) VALUES (2014,7);
INSERT INTO t_year_month (year, month) VALUES (2014,8);
INSERT INTO t_year_month (year, month) VALUES (2014,9);
INSERT INTO t_year_month (year, month) VALUES (2014,10);
INSERT INTO t_year_month (year, month) VALUES (2014,11);
INSERT INTO t_year_month (year, month) VALUES (2014,12);

SELECT sum(weight) AS sums FROM t_year_month , t_carbon_weight
WHERE t_year_month.id = t_carbon_weight.year_month_id
      AND t_year_month.year = 2015;