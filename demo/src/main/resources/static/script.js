async function searchSalary() {

const range = document.getElementById("range").value;
const year = document.getElementById("year").value;

const response = await fetch(
`http://localhost:8080/salary?range=${range}&year=${year}`
);

if (!response.ok) {
alert("Salary not found.");
return;
}

const data = await response.json();

document.getElementById("result").classList.remove("hidden");

document.getElementById("jobTitle").textContent = data.jobTitle;

document.getElementById("hourly").textContent =
`$${data.hourlySalary.toFixed(2)}`;

document.getElementById("monthly").textContent =
`$${data.monthlySalary.toFixed(2)}`;
}