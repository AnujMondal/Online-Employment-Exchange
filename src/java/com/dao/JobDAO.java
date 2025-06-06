package com.dao;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.Jobs;

public class JobDAO {

	private Connection conn;

	public JobDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean addJobs(Jobs j) {

		boolean f = false;
		try {
			String sql = "insert into jobs(title, description, category, status, location) values(?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, j.getTitle());
			ps.setString(2, j.getDescription());
			ps.setString(3, j.getCategory());
			ps.setString(4, j.getStatus());
			ps.setString(5, j.getLocation());

			int i = ps.executeUpdate();

			if (i == 1)
				f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public List<Jobs> getAllJobs() {
    List<Jobs> list = new ArrayList<>();
    Jobs j = null;
    try {
        String sql = "SELECT * FROM jobs WHERE status='Active' ORDER BY id DESC";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            j = new Jobs();
            j.setId(rs.getInt(1));
            j.setTitle(rs.getString(2));
            j.setDescription(rs.getString(3));
            j.setCategory(rs.getString(4));
            j.setStatus(rs.getString(5));
            j.setLocation(rs.getString(6));
            j.setPdate(rs.getTimestamp(7) + "");
            list.add(j);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return list;
}

	public Jobs getJobById(int id) {

		Jobs j = null;

		try {
			String sql = "select * from jobs where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				j = new Jobs();
				j.setId(rs.getInt(1));
				j.setTitle(rs.getString(2));
				j.setDescription(rs.getString(3));
				j.setCategory(rs.getString(4));
				j.setStatus(rs.getString(5));
				j.setLocation(rs.getString(6));
				j.setPdate(rs.getTimestamp(7) + "");
			}
                        if (!rs.isBeforeFirst()) {
    System.out.println("No jobs found in the database.");
}
while (rs.next()) {
    System.out.println("Job Found: " + rs.getString("title"));
    // Process the jobs here...
}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	public boolean updateJob(Jobs j) {

		boolean f = false;

		try {
			String sql = "update jobs set title=?, discription=?, category=?, status=?, location=? where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, j.getTitle());
			ps.setString(2, j.getDescription());
			ps.setString(3, j.getCategory());
			ps.setString(4, j.getStatus());
			ps.setString(5, j.getLocation());
			ps.setInt(6, j.getId());

			int i = ps.executeUpdate();

			if (i == 1)
				f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public boolean deleteJob(int id) {

		boolean f = false;

		try {
			String sql = "delete from jobs where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			int i = ps.executeUpdate();

			if (i == 1)
				f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public List<Jobs> getAllJobsForUser() {

		List<Jobs> list = new ArrayList<>();
		Jobs j = null;

		try {
			String sql = "select * from jobs where status=? order by id desc";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Active");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				j = new Jobs();
				j.setId(rs.getInt(1));
				j.setTitle(rs.getString(2));
				j.setDescription(rs.getString(3));
				j.setCategory(rs.getString(4));
				j.setStatus(rs.getString(5));
				j.setLocation(rs.getString(6));
				j.setPdate(rs.getTimestamp(7) + "");
				list.add(j);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Jobs> getJobsOrLocationCategory(String cat, String loc) {

		List<Jobs> list = new ArrayList<>();
		Jobs j = null;

		try {
			String sql = "select * from jobs where status=? and (location=? or category=?) order by id desc";			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Active");
			ps.setString(2, loc);
			ps.setString(3, cat);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				j = new Jobs();
				j.setId(rs.getInt(1));
				j.setTitle(rs.getString(2));
				j.setDescription(rs.getString(3));
				j.setCategory(rs.getString(4));
				j.setStatus(rs.getString(5));
				j.setLocation(rs.getString(6));
				j.setPdate(rs.getTimestamp(7) + "");
				list.add(j);
			}
                        if (!rs.isBeforeFirst()) {
    System.out.println("No jobs found in the database.");
}
while (rs.next()) {
    System.out.println("Job Found: " + rs.getString("title"));
    // Process the jobs here...
}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Jobs> getJobsAndLocationCategory(String cat, String loc) {

		List<Jobs> list = new ArrayList<>();
		Jobs j = null;

		try {
			String sql = "select * from jobs where status=? and category=? and location=? order by id desc";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Active");
			ps.setString(2, cat);
			ps.setString(3, loc);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				j = new Jobs();
				j.setId(rs.getInt(1));
				j.setTitle(rs.getString(2));
				j.setDescription(rs.getString(3));
				j.setCategory(rs.getString(4));
				j.setStatus(rs.getString(5));
				j.setLocation(rs.getString(6));
				j.setPdate(rs.getTimestamp(7) + "");
				list.add(j);
			}
                        if (!rs.isBeforeFirst()) {
    System.out.println("No jobs found in the database.");
}
while (rs.next()) {
    System.out.println("Job Found: " + rs.getString("title"));
    // Process the jobs here...
}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

}
