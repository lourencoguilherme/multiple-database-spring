CREATE DATABASE IF NOT EXISTS financys;

CREATE EXTENSION IF NOT EXISTS unaccent;
INSERT INTO public.categories(id, created, deleted, updated, name, description) VALUES (1, '2019-02-27 17:13:39.464474', false, null, 'Moradia', 'Pagamentos de Contas da Casa');
INSERT INTO public.categories(id, created, deleted, updated, name, description) VALUES (2, '2019-02-27 17:13:39.464474', false, null, 'Saúde', 'Plano de Saúde e Remédios');
INSERT INTO public.categories(id, created, deleted, updated, name, description) VALUES (3, '2019-02-27 17:13:39.464474', false, null, 'Lazer', 'Cinema, parques, praia, etc');
INSERT INTO public.categories(id, created, deleted, updated, name, description) VALUES (4, '2019-02-27 17:13:39.464474', false, null, 'Salário', 'Recebimentos de Salário');
INSERT INTO public.categories(id, created, deleted, updated, name, description) VALUES (5, '2019-02-27 17:13:39.464474', false, null, 'Freelas', 'Trabalhos como freelancer');
select setval('public.categories_id_seq', (select max(id) from public.categories));


INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (1, '2019-02-27 17:13:39.464474', false, null, 'Gás de Cozinha', 'Somente Insert', true,         '2019-02-27 17:13:39.464474',78.00, 'expense',1);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (2, '2019-02-27 17:13:39.464474', false, null, 'Suplementos', 'Somente Insert', true, '2019-02-27 17:13:39.464474', 15.00, 'expense',1);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (3, '2019-02-27 17:13:39.464474', false, null, 'Salário', 'Somente Insert', true, '2019-02-27 17:13:39.464474', 4405.49, 'revenue',3);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (4, '2019-02-27 17:13:39.464474', false, null, 'Alugém de Filme', 'Somente Insert', true, '2019-02-27 17:13:39.464474', 15.00, 'expense',2);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (5, '2019-02-27 17:13:39.464474', false, null, 'Suplementos', 'Somente Insert', true, '2019-02-27 17:13:39.464474', 30.00, 'expense',1);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (6, '2019-02-27 17:13:39.464474', false, null, 'Video Game da Filha', 'Somente Insert', true, '2019-02-27 17:13:39.464474', 15.00, 'expense',3);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (7, '2019-02-27 17:13:39.464474', false, null, 'Uber', 'Somente Insert', true, '2019-02-27 17:13:39.464474', 15.00, 'expense',1);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (8, '2019-02-27 17:13:39.464474', false, null, 'Aluguél', 'Somente Insert', true, '2019-02-27 17:13:39.464474', 16.00, 'expense',1);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (9, '2019-02-27 17:13:39.464474', false, null, 'Gás de Cozinha', 'Somente Insert', true, '2019-12-27 17:13:39.464474', 90.00, 'expense',1);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (10, '2019-02-27 17:13:39.464474', false, null, 'Pagamento Pelo Projeto', 'Somente Insert', true, '2019-02-27 17:13:39.464474', 50.00, 'expense',5);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (11, '2019-02-27 17:13:39.464474', false, null, 'Aluguel de Filme', 'Somente Insert', true, '2019-09-27 17:13:39.464474', 2.00, 'expense',1);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (12, '2019-02-27 17:13:39.464474', false, null, 'Video Game', 'Somente Insert', true, '2019-02-27 17:13:39.464474', 25.00, 'expense',3);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (13, '2019-02-27 17:13:39.464474', false, null, 'Cinema', 'Somente Insert', true, '2019-06-27 17:13:39.464474', 25.00, 'expense',3);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (14, '2019-02-27 17:13:39.464474', false, null, 'Jiu Jitsu', 'Somente Insert', true, '2019-04-27 17:13:39.464474', 25.00, 'expense',3);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (15, '2019-02-27 17:13:39.464474', false, null, 'Uber', 'Somente Insert', true, '2019-04-27 17:13:39.464474', 25.00, 'expense',3);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (16, '2019-02-27 17:13:39.464474', false, null, 'Cinema', 'Somente Insert', true, '2019-04-27 17:13:39.464474', 25.00, 'expense',3);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (17, '2019-02-27 17:13:39.464474', false, null, 'Academia', 'Somente Insert', true, '2019-03-27 17:13:39.464474', 25.00, 'expense',3);
INSERT INTO public.entries(id, created, deleted, updated, name, description, paid, date, amount, type, category_id) VALUES (18, '2019-02-27 17:13:39.464474', false, null, 'Bares', 'Somente Insert', true, '2019-03-27 17:13:39.464474', 25.00, 'expense',3);

select setval('public.entries_id_seq', (select max(id) from public.entries));
