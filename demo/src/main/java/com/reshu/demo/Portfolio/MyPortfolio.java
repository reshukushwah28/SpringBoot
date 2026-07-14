package com.reshu.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/myself")
    public String myself() {
        return """
                <h1>Myself</h1>

                <p>
                    Hi, I'm <b>Reshu Kushwah</b>!
                </p>

                <p>
                    💫 Aspiring Software Developer | Data Science Enthusiast | Lifelong Learner
                </p>

                <p>
                    🌱 Passionate about Artificial Intelligence, Data Science and Software Development.<br>
                    💻 Love building real-world projects and solving challenging problems.<br>
                    🚀 Continuously improving my programming, DSA and development skills.
                </p>

                <ul>
                    <li><b>LinkedIn:</b> https://www.linkedin.com/in/reshu-kushwah/</li>
                    <li><b>GitHub:</b> https://github.com/reshukushwah28</li>
                    <li><b>LeetCode:</b> https://leetcode.com/u/reshu_kushwah28/</li>
                    <li><b>Email:</b> reshukushwah234@gmail.com</li>
                </ul>
                """;
    }

    @GetMapping("/skills")
    public String skills() {
        return """
                <h1>My Skills</h1>

                <ul>
                    <li><b>Languages:</b> Java, Python, C, SQL, HTML, CSS</li>

                    <li><b>Data Science:</b> Pandas, NumPy, Scikit-Learn, Seaborn</li>

                    <li><b>Visualization:</b> Power BI, Matplotlib, MS Excel</li>

                    <li><b>Tools:</b> Git, GitHub, Google Colab, Jupyter Notebook, Visual Studio Code</li>

                    <li><b>Soft Skills:</b> Leadership, Problem Solving, Communication, Adaptability, Analytical Thinking</li>
                </ul>
                """;
    }

    @GetMapping("/education")
    public String education() {
        return """
                <h1>Education</h1>

                <ul>

                    <li>
                        <h3>Lovely Professional University, Punjab</h3>
                        <p>Bachelor of Technology - Computer Science and Engineering</p>
                        <p>CGPA : 7.82</p>
                        <p>Aug 2023 - Present</p>
                    </li>

                    <br>

                    <li>
                        <h3>Saint Vivekanand Senior Secondary Public School, Etawah</h3>
                        <p>Intermediate</p>
                        <p>Percentage : 85%</p>
                        <p>2022 - 2023</p>
                    </li>

                    <br>

                    <li>
                        <h3>Saint Vivekanand Senior Secondary Public School, Etawah</h3>
                        <p>Matriculation</p>
                        <p>Percentage : 80%</p>
                        <p>2020 - 2021</p>
                    </li>

                </ul>
                """;
    }

    @GetMapping("/project")
    public String project() {
        return """
                <h1>Projects</h1>

                <h2>1. Zestify AI</h2>

                <ul>
                    <li>Developed an AI-powered web application using the Google Gemini API for intelligent text generation and image understanding.</li>

                    <li>Designed a responsive user interface using React.js, TypeScript and Tailwind CSS.</li>

                    <li>Improved application performance using lazy loading and code splitting.</li>

                    <li><b>Tech Stack:</b> React.js, TypeScript, Tailwind CSS, Gemini API, Git, Netlify</li>
                </ul>

                <hr>

                <h2>2. Obesity Intelligence Platform</h2>

                <ul>
                    <li>Built an end-to-end machine learning application to predict obesity levels with 92% accuracy.</li>

                    <li>Implemented multiple machine learning algorithms for classification and regression.</li>

                    <li>Integrated SHAP Explainable AI with an interactive Streamlit dashboard.</li>

                    <li><b>Tech Stack:</b> Python, Scikit-Learn, Pandas, NumPy, SHAP, Streamlit, Matplotlib</li>
                </ul>

                <hr>

                <h2>3. Public Libraries Dashboard</h2>

                <ul>
                    <li>Created an end-to-end data analytics pipeline using Python and SQL.</li>

                    <li>Designed interactive Power BI dashboards with advanced DAX calculations.</li>

                    <li>Improved reporting efficiency and data visualization for library management.</li>

                    <li><b>Tech Stack:</b> Python, SQL, Power BI, Excel</li>
                </ul>
                """;
    }
}