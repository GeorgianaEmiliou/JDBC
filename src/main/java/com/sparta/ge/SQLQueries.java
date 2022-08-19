package com.sparta.ge;

public interface SQLQueries {
    public static final String SELECT_ALL = "SELECT * FROM public.user_db";
    public static final String INSERT_INTO_DB = "INSERT INTO public.user_db (id, name, email) VALUES (?, ?, ?)";
    public static final String DELETE = "DELETE FROM public.user_db WHERE id = ?";

    public static final String UPDATE = "UPDATE public.user_db SET name = ? WHERE id = ?";

}
