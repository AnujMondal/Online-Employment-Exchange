
# 🌐 Online Employment Exchange Application

A web-based Job Portal application built using Java EE (J2EE) technology that connects job seekers with employers.

## ✨ Features

- 🔐 **User Authentication**: Secure login and registration system
- 📋 **Job Listings**: Browse and search available job postings
- 💼 **Job Management**: Employers can add, edit, and delete job listings
- 👤 **User Profiles**: Users can create and manage their professional profiles
- 👨‍💼 **Admin Dashboard**: Admin interface for managing users and job listings

## 🛠️ Technologies Used

- ☕ Java EE (J2EE)
- 📄 JSP (JavaServer Pages)
- 🔄 Servlets
- 🗃️ JDBC for database connectivity
- 🎨 HTML, CSS for frontend
- 🖥️ Apache Tomcat server

## 📁 Project Structure

- 📂 `src/java/com/servlet/`: Contains servlet classes that handle HTTP requests
- 📂 `src/java/com/dao/`: Data Access Objects for database operations
- 📂 `src/java/com/entity/`: Entity classes representing data models
- 📂 `src/java/com/DB/`: Database connection utilities
- 📂 `web/`: Contains JSP pages, CSS, and frontend resources

## 👨‍💻 Contributors
Meet the awesome team behind this project:

| Name | GitHub | LinkedIn |
|------|--------|---------|
| **Nandini Kapil** | [@GitHub](https://github.com/Nandini0029) | [LinkedIn](https://www.linkedin.com/in/nandini-kapil-3704b3242) |
| **Anuj Mondal** | [@GitHub](https://github.com/AnujMondal) | [LinkedIn](www.linkedin.com/in/anujmondal) |
| **Charu Thakral** | [@GitHub](https://github.com/CharuThakral03) | [LinkedIn](https://www.linkedin.com/in/charuthakral) |
| **Aashutosh Srivastava** | [@GitHub](https://github.com/Aashutosh-Srivastava) | [LinkedIn](https://www.linkedin.com/in/aashutosh-srivastava-7105b4344/) |

## 🚀 Setup Instructions

1. **Prerequisites**:
   - ☕ Java Development Kit (JDK) 8 or higher
   - 🖥️ Apache Tomcat 9.0 or higher
   - 🗄️ MySQL Database
   - 🛠️ NetBeans IDE (recommended)

2. **Database Setup**:
   - 📊 Create a MySQL database named `jobportal`
   - 📥 Import the database schema from `database/jobportal.sql` (if available)

3. **Project Configuration**:
   - 📂 Open the project in NetBeans
   - ⚙️ Configure Tomcat server in NetBeans
   - 🔄 Update database connection settings in `src/java/com/DB/DBConnect.java`

4. **Run the Application**:
   - 🔨 Build the project in NetBeans
   - 🚀 Deploy to Tomcat server
   - 🌐 Access the application at `http://localhost:8080/JobPortal/`

## 📝 Usage

1. **For Job Seekers** 👨‍🎓:
   - ✍️ Register a new account
   - 🔑 Login with your credentials
   - 📝 Update your profile with qualifications
   - 🔍 Browse and search for jobs
   - 📨 Apply for positions

2. **For Employers** 👨‍💼:
   - 🔑 Login with employer credentials
   - ➕ Post new job listings
   - 📊 Manage existing job postings
   - 👥 View applicants

3. **For Administrators** 👑:
   - 🔐 Access admin panel with admin credentials (email: admin@gmail.com, password: 12345678)
   - 👮‍♂️ Manage all users and job listings
   - 📊 Monitor system activity

## 📜 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 🙏 Acknowledgments

- ✨ Thanks to all contributors who have helped with this project
- 🌟 Special thanks to our mentors and advisors for their guidance
