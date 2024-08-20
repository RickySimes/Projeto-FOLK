<template>
  <div class="flex flex-col min-h-screen">
    <!-- Header -->
    <header class="bg-gradient-to-r from-blue-600 to-purple-900 text-white py-4 shadow-lg">
      <nav class="container mx-auto flex justify-center items-center space-x-8">
        <ul class="flex space-x-8 md:space-x-24 font-folk text-sm md:text-base">
          <li><router-link to="/" class="hover:text-gray-200">Home</router-link></li>
          <li><a target="_blank" href="https://issuu.com/cofit/docs/folk_azores_2024_cartaz_a4_web"
              class="hover:text-gray-200">Programa</a></li>
          <li><router-link to="/Volunteer" class="hover:text-gray-200">Voluntariado</router-link></li>
          <li><a href="#" class="hover:text-gray-200">História</a></li>
        </ul>
      </nav>
    </header>

    <!-- Main Content -->
    <main class="flex-grow flex items-center justify-center bg-gray-100">
      <div class="w-full max-w-4xl p-8 bg-white font-folk rounded-lg shadow-md">
        <form class="space-y-6">
          <h1 class="text-2xl font-bold mb-6 text-gray-800">Voluntariado Folk Azores</h1>

          <!-- Full Name -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="fullName">Nome Completo</label>
            <input
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="fullName" type="text" placeholder="Nome Completo" />
          </div>

          <!-- Email -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="email">Email</label>
            <input
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="email" type="email" placeholder="Email" />
          </div>

          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="birthdate">Data de Nascimento</label>
            <input
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="birthdate" type="text" placeholder="Data de Nascimento" />
          </div>

          <!-- Phone Number -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="phone">Telemóvel</label>
            <input
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="phone" type="tel" placeholder="Telemóvel" />
          </div>

          <!-- T-Shirt Size -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Tamanho da T-Shirt</label>
            <div class="flex flex-wrap items-center space-x-6">
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="XS" class="radio-button">
                XS</label>
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="S" class="radio-button">
                S</label>
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="M" class="radio-button">
                M</label>
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="L" class="radio-button">
                L</label>
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="XL" class="radio-button">
                XL</label>
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="XXL" class="radio-button">
                XXL</label>
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="XXXL" class="radio-button">
                XXXL</label>
            </div>
          </div>

          <!-- CC Number -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="ccNumber">N.º Cartão de Cidadão</label>
            <input
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="ccNumber" type="text" placeholder="Your Credit Card Number" />
          </div>

          <!-- NIF -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="nif">N.º Identificação Fiscal</label>
            <input
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="nif" type="text" placeholder="Your NIF" />
          </div>

          <!-- Education Level -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Habilitações Literárias</label>
            <div class="flex flex-wrap items-center space-x-4">
              <label class="flex items-center"><input type="radio" name="educationLevel" value="Basico"
                  class="radio-button"> Básico</label>
              <label class="flex items-center"><input type="radio" name="educationLevel" value="Secundario"
                  class="radio-button">
                Secundário</label>
              <label class="flex items-center"><input type="radio" name="educationLevel" value="Licenciatura"
                  class="radio-button">
                Licenciatura</label>
              <label class="flex items-center"><input type="radio" name="educationLevel" value="Mestrado"
                  class="radio-button"> Mestrado</label>
              <label class="flex items-center"><input type="radio" name="educationLevel" value="Doutoramento"
                  class="radio-button">
                Doutoramento</label>
            </div>
          </div>

          <!-- Facebook Link -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="facebook">Facebook</label>
            <input
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="facebook" type="url" placeholder="Facebook Profile Link" />
          </div>

          <!-- Instagram Link -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="instagram">Instagram</label>
            <input
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="instagram" type="url" placeholder="Instagram Profile Link" />
          </div>

          <!-- Occupation -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="occupation">Ocupação</label>
            <input
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="occupation" type="text" placeholder="Your Occupation" />
          </div>

          <!-- Languages Spoken -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Idioma(s)</label>
            <div class="flex flex-wrap items-center space-x-4">
              <label class="flex items-center"><input type="checkbox" name="languages" value="Inglês" class="checkbox"> Inglês</label>
              <label class="flex items-center"><input type="checkbox" name="languages" value="Espanhol" class="checkbox"> Espanhol</label>
              <label class="flex items-center"><input type="checkbox" name="languages" value="Frances" class="checkbox"> Francês</label>
              <label class="flex items-center"><input type="checkbox" name="languages" value="Alemao" class="checkbox"> Alemão</label>
              <label class="flex items-center"><input type="checkbox" name="languages" value="Italiano" class="checkbox"> Italiano</label>
              <label class="flex items-center"><input type="checkbox" name="languages" value="Russo" class="checkbox"> Russo</label>
              <label class="flex items-center"><input type="checkbox" name="languages" value="Ucraniano" class="checkbox"> Ucraniano</label>
              
            </div>
            <label class="flex mt-4 mb-2 items-center"><input type="checkbox" name="languages" value="Other" class="checkbox"> Other</label>
            <!-- Textbox for Other Language -->
            <input
              class="mt-2 shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="otherLanguage" type="text" placeholder="Specify Other Language" />
          </div>

          <!-- Areas of Interest -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Área de voluntariado pretendida</label>
            <div class="flex flex-wrap items-center space-x-4">
              <label class="flex items-center"><input type="checkbox" name="areas" value="Acompanhamento de grupos" class="checkbox">
                Acompanhamento de Grupos</label>
                <label class="flex items-center"><input type="checkbox" name="areas" value="Secretariado" class="checkbox"> Secretariado</label>
                <label class="flex items-center"><input type="checkbox" name="areas" value="Multimedia" class="checkbox"> Multimédia</label>
                <label class="flex items-center"><input type="checkbox" name="areas" value="Logistica" class="checkbox"> Logística</label>
                <label class="flex items-center"><input type="checkbox" name="areas" value="Vendas" class="checkbox"> Vendas</label>
                <label class="flex items-center"><input type="checkbox" name="areas" value="Bar" class="checkbox"> Bar</label>
            </div>
          </div>

          <!-- Weekly Availability -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Disponibilidade Semanal</label>
            <div class="flex items-center space-x-4">
              <label class="flex items-center"><input type="checkbox" name="availability" value="Semana" class="checkbox"> Semana</label>
              <label class="flex items-center"><input type="checkbox" name="availability" value="Fim-de-semana" class="checkbox">
                Fim-de-semana</label>
            </div>
          </div>

          <!-- Time of Day Availability -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Disponibilidade no período do dia</label>
            <div class="flex items-center space-x-4">
              <label class="flex items-center"><input type="checkbox" name="timeAvailability" value="Manha" class="checkbox"> Manhã</label>
              <label class="flex items-center"><input type="checkbox" name="timeAvailability" value="Tarde" class="checkbox"> Tarde</label>
              <label class="flex items-center"><input type="checkbox" name="timeAvailability" value="Noite" class="checkbox"> Noite</label>
            </div>
          </div>

          <!-- Submit Button -->
          <div class="flex items-center justify-between">
            <button
              class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline"
              type="button">
              Submit
            </button>
          </div>
        </form>
      </div>
    </main>

    <!-- Footer -->
    <footer class="bg-gradient-to-r from-blue-600 to-purple-900 text-white py-4 shadow-lg">
      <nav class="container mx-auto flex justify-center items-center space-x-8">
        <ul class="flex space-x-8 md:space-x-24 font-folk text-sm md:text-base">
          <li><a target="_blank" href="https://www.facebook.com/folkazores" class="hover:text-gray-200">Facebook</a>
          </li>
          <li><a target="_blank" href="https://www.instagram.com/folk.azores/" class="hover:text-gray-200">Instagram</a>
          </li>
        </ul>
      </nav>
    </footer>
  </div>
</template>

<style>
/* Google-style radio button */
.radio-button {
  appearance: none;
  background-color: #fff;
  margin: 0;
  font: inherit;
  width: 24px;
  height: 24px;
  border: 2px solid #d1d5db;
  border-radius: 50%;
  display: grid;
  place-content: center;
  cursor: pointer;
  margin-right: 10px;
}

.radio-button::before {
  content: "";
  width: 12px;
  height: 12px;
  border-radius: 50%;
  transform: scale(0);
  transition: 120ms transform ease-in-out;
  box-shadow: inset 14px 14px #2563eb;
  /* Adjust this color to match your theme */
}

.radio-button:checked::before {
  transform: scale(1);
}

.radio-button:focus {
  outline: none;
  box-shadow: 0 0 0 4px rgba(37, 99, 235, 0.3);
}


/* Google-style checkbox */
.checkbox {
  appearance: none;
  background-color: #fff;
  font: inherit;
  width: 24px;
  height: 24px;
  border: 2px solid #d1d5db;
  border-radius: 4px;
  display: grid;
  place-content: center;
  cursor: pointer;
  margin-right: 10px;
}

.checkbox::before {
  content: "";
  width: 16px;
  height: 16px;
  clip-path: polygon(14% 44%, 0 65%, 50% 100%, 100% 16%, 80% 0, 43% 62%);
  transform: scale(0);
  transition: 120ms transform ease-in-out;
  background-color: #2563eb;
  /* Adjust this color to match your theme */
}

.checkbox:checked::before {
  transform: scale(1);
}

.checkbox:focus {
  outline: none;
  box-shadow: 0 0 0 4px rgba(37, 99, 235, 0.3);
}

/* Responsive Form Styling */
@media (max-width: 640px) {
  .form-container {
    padding: 4px;
  }

  .form-container input,
  .form-container textarea {
    font-size: 0.875rem;
  }
}
</style>

<script>

import { defineComponent, onMounted } from 'vue';
import flatpickr from 'flatpickr';
import 'flatpickr/dist/flatpickr.min.css';

export default defineComponent({
  setup() {
    onMounted(() => {
      flatpickr('#birthdate', {
        dateFormat: 'Y-m-d',
        locale: 'pt', // Optional: Set locale to Portuguese if needed
      });
    });
  },
});

</script>
