const backgroundColors = [
        'rgba(255, 99, 132, 0.2)',
        'rgba(54, 162, 235, 0.2)',
        'rgba(255, 205, 86, 0.2)',
        'rgba(75, 192, 192, 0.2)',
        'rgba(153, 102, 255, 0.2)',
        'rgba(255, 159, 64, 0.2)'
    ];
const borderColors = [
        'rgb(255, 99, 132)',
        'rgb(54, 162, 235)',
        'rgb(255, 205, 86)',
        'rgb(75, 192, 192)',
        'rgb(153, 102, 255)',
        'rgb(255, 159, 64)'
    ];

const ctx = document.getElementById('myChart');

new Chart(ctx, {
  type: 'pie',
  data: {
    labels: ['Je suis mort', 'Je suis en train de mourire',"Je n'ai pas entendu la sonnerie"],
    datasets: [{
      data: [48, 48, 4],
      borderWidth: 1,
      backgroundColor: backgroundColors,
      borderColor: borderColors,
      hoverOffset: 4,
    }]
  },
  options: {
    plugins: {
        title: {
            display: true,
            text: 'Ce que pense ma mère quand je ne réponds pas au téléphone',
            position: 'bottom',
            padding: {top:30, bottom:10}
        },
    }
  }
});


const ctx2 = document.getElementById('myChart2');
new Chart(ctx2, {

  type : 'line',
  data : {
    labels: [2000,2001,2002,2003,2004,2005,2006,2007,2008,2009],
    datasets: [
    {
        yAxisID: 'Axis1',
        labels: "Consommation de margarien par habitant en livre de margarine",
        data: [8.2,7,6.5,5.3,5.2,4,4.6, 4,4,4,4],
        borderColors: 'rgb(255, 99, 132)',
    },
    {
        yAxisID: 'Axis2',
        labels: "Taux divorse",
        data: [5,4.7,4.6,4.4,4.3,4.1,4.2,4.2,4.2, 4],
        borderColors: 'rgb(255, 99, 132)',
    }


    ],


  },
  options: {
    scales: {
      Axis1: {
        position: 'left',
      },
      Axis2: {
        position: 'right'
      }
    }
  }

  
});