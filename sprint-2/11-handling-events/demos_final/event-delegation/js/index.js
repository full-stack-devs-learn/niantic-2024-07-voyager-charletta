const colors = document.getElementById("colors");
colors.addEventListener("click", event =>
{
	if (event.target.nodeName.toLowerCase() === "li")
	{
		event.target.style.backgroundColor = event.target.innerText;
		event.target.style.color = "white";
	}
});

function addNewColor ()
{
	const newColor = document.getElementById('newColor')
	const newLi = document.createElement('li');

	newLi.innerText = newColor.value;
	colors.appendChild(newLi);
}

document.addEventListener('DOMContentLoaded', () =>
{
	const button = document.getElementById('btnAddOrange');
	button.addEventListener('click', addNewColor);

	const links = document.querySelectorAll('a')

	links.forEach(link =>
	{
		link.addEventListener('click', (event) =>
		{
			const shouldNavigate = confirm("You are about to leave the page. Do you want to continue?")
			if(!shouldNavigate)
			{
				event.preventDefault();
			}
		})
	})
});


