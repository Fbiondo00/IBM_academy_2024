package com.sistemi.informativi.sql;

public interface SqlScript {

   static String sqlCourseInsert = "insert into course(title)values(?)";

   static String sqlReviewInsert = "insert into review(location, course_id)values(?,?)";

   static String getSqlReviewLocationByCourse = "select location from course, review where review.course_id=course.id and course.id=?";

   static String sqlDeleteCourse = "delete from course where id = ?";

}
