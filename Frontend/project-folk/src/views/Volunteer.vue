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
        <form @submit.prevent="handleSubmit" class="space-y-6">
          <h1 class="text-2xl font-bold mb-6 text-gray-800">Voluntariado Folk Azores</h1>

          <!-- Full Name -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="fullName">Nome Completo</label>
            <input v-model="formData.fullName"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="fullName" type="text" placeholder="Nome Completo"/>
          </div>

          <!-- Email -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="email">Email</label>
            <input v-model="formData.email"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="email" type="email" placeholder="Email" />
          </div>

          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="birthdate">Data de Nascimento</label>
            <input v-model="formData.birthdate"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="birthdate" type="text" placeholder="Data de Nascimento" />
          </div>

          <!-- Phone Number -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="phone">Telemóvel</label>
            <input v-model="formData.phone"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="phone" type="number" placeholder="Telemóvel" />
          </div>

          <!-- T-Shirt Size -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Tamanho da T-Shirt</label>
            <div class="flex flex-wrap items-center space-x-6">
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="XS" class="radio-button"
                  v-model="formData.tshirtSize">
                XS</label>
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="S" class="radio-button"
                  v-model="formData.tshirtSize">
                S</label>
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="M" class="radio-button"
                  v-model="formData.tshirtSize">
                M</label>
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="L" class="radio-button"
                  v-model="formData.tshirtSize">
                L</label>
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="XL" class="radio-button"
                  v-model="formData.tshirtSize">
                XL</label>
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="XXL" class="radio-button"
                  v-model="formData.tshirtSize">
                XXL</label>
              <label class="flex items-center"><input type="radio" name="tshirtSize" value="XXXL" class="radio-button"
                  v-model="formData.tshirtSize">
                XXXL</label>
            </div>
          </div>

          <!-- CC Number -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="ccNumber">N.º Cartão de Cidadão</label>
            <input v-model="formData.ccNumber"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="ccNumber" type="number" placeholder="Your Credit Card Number" />
          </div>

          <!-- NIF -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="nif">N.º Identificação Fiscal</label>
            <input v-model="formData.nif"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="nif" type="number" placeholder="Your NIF" />
          </div>

          <!-- Education Level -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Habilitações Literárias</label>
            <div class="flex flex-wrap items-center space-x-4">
              <label class="flex items-center"><input type="radio" name="educationLevel" value="Basico"
                  class="radio-button" v-model="formData.educationLevel"> Básico</label>
              <label class="flex items-center"><input type="radio" name="educationLevel" value="Secundario"
                  class="radio-button" v-model="formData.educationLevel">
                Secundário</label>
              <label class="flex items-center"><input type="radio" name="educationLevel" value="Licenciatura"
                  class="radio-button" v-model="formData.educationLevel">
                Licenciatura</label>
              <label class="flex items-center"><input type="radio" name="educationLevel" value="Mestrado"
                  class="radio-button" v-model="formData.educationLevel"> Mestrado</label>
              <label class="flex items-center"><input type="radio" name="educationLevel" value="Doutoramento"
                  class="radio-button" v-model="formData.educationLevel">
                Doutoramento</label>
            </div>
          </div>

          <!-- Facebook Link -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="facebook">Facebook</label>
            <input v-model="formData.facebook"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="facebook" type="url" placeholder="Facebook Profile Link" />
          </div>

          <!-- Instagram Link -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="instagram">Instagram</label>
            <input v-model="formData.instagram"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="instagram" type="url" placeholder="Instagram Profile Link" />
          </div>

          <!-- Occupation -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="occupation">Ocupação</label>
            <input v-model="formData.occupation"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="occupation" type="text" placeholder="Your Occupation" />
          </div>

          <!-- Languages Spoken -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Idioma(s)</label>
            <div class="flex flex-wrap items-center space-x-4">
              <label class="flex items-center">
                <input type="checkbox" name="languages" value="Inglês" class="checkbox" v-model="formData.languages">
                Inglês
              </label>
              <label class="flex items-center">
                <input type="checkbox" name="languages" value="Espanhol" class="checkbox" v-model="formData.languages">
                Espanhol
              </label>
              <label class="flex items-center">
                <input type="checkbox" name="languages" value="Frances" class="checkbox" v-model="formData.languages">
                Francês
              </label>
              <label class="flex items-center">
                <input type="checkbox" name="languages" value="Alemao" class="checkbox" v-model="formData.languages">
                Alemão
              </label>
              <label class="flex items-center">
                <input type="checkbox" name="languages" value="Italiano" class="checkbox" v-model="formData.languages">
                Italiano
              </label>
              <label class="flex items-center">
                <input type="checkbox" name="languages" value="Russo" class="checkbox" v-model="formData.languages">
                Russo
              </label>
              <label class="flex items-center">
                <input type="checkbox" name="languages" value="Ucraniano" class="checkbox" v-model="formData.languages">
                Ucraniano
              </label>
            </div>

            <label class="flex mt-4 mb-2 items-center">
              <input type="checkbox" class="checkbox" v-model="customLanguageEnabled"> Other
            </label>
            <!-- Textbox for Other Language -->
            <input v-if="customLanguageEnabled" v-model="formData.otherLanguage"
              class="mt-2 shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="otherLanguage" type="text" placeholder="Specify Other Language" />
          </div>

          <!-- Areas of Interest -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Área de voluntariado pretendida</label>
            <div class="flex flex-wrap items-center space-x-4">
              <label class="flex items-center"><input type="checkbox" name="areas" value="Acompanhamento de grupos"
                  class="checkbox" v-model="formData.areas">
                Acompanhamento de Grupos</label>
              <label class="flex items-center"><input type="checkbox" name="areas" value="Secretariado" class="checkbox"
                  v-model="formData.areas"> Secretariado</label>
              <label class="flex items-center"><input type="checkbox" name="areas" value="Multimedia" class="checkbox"
                  v-model="formData.areas">
                Multimédia</label>
              <label class="flex items-center"><input type="checkbox" name="areas" value="Logistica" class="checkbox"
                  v-model="formData.areas">
                Logística</label>
              <label class="flex items-center"><input type="checkbox" name="areas" value="Vendas" class="checkbox"
                  v-model="formData.areas">
                Vendas</label>
              <label class="flex items-center"><input type="checkbox" name="areas" value="Bar" class="checkbox"
                  v-model="formData.areas">
                Bar</label>
            </div>
          </div>

          <!-- Weekly Availability -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Disponibilidade Semanal</label>
            <div class="flex items-center space-x-4">
              <label class="flex items-center"><input type="checkbox" name="availability" value="Semana"
                  class="checkbox" v-model="formData.availability"> Semana</label>
              <label class="flex items-center"><input type="checkbox" name="availability" value="Fim-de-semana"
                  class="checkbox" v-model="formData.availability">
                Fim-de-semana</label>
            </div>
          </div>

          <!-- Time of Day Availability -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Disponibilidade no período do dia</label>
            <div class="flex items-center space-x-4">
              <label class="flex items-center"><input type="checkbox" name="timeAvailability" value="Manha"
                  class="checkbox" v-model="formData.timeAvailability"> Manhã</label>
              <label class="flex items-center"><input type="checkbox" name="timeAvailability" value="Tarde"
                  class="checkbox" v-model="formData.timeAvailability"> Tarde</label>
              <label class="flex items-center"><input type="checkbox" name="timeAvailability" value="Noite"
                  class="checkbox" v-model="formData.timeAvailability"> Noite</label>
            </div>
          </div>

          <!-- Submit Button -->
          <div class="flex items-center justify-between">
            <button :disabled="!isFormValid" :class="{ 'btn-disabled': !isFormValid }" type="submit">

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

button {
  background-color: #007bff;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

/* Disabled button styling */
.btn-disabled {
  background-color: #a0c4ff; /* Lighter shade of blue */
  cursor: not-allowed;
}

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

import { defineComponent, ref, onMounted, computed, watch} from 'vue';
import flatpickr from 'flatpickr';
import 'flatpickr/dist/flatpickr.min.css';

export default defineComponent({
  setup() {

    const formData = ref({
      fullName: '',
      email: '',
      birthdate: '',
      phone: '',
      tshirtSize: '',
      ccNumber: '',
      nif: '',
      educationLevel: '',
      facebook: '',
      instagram: '',
      occupation: '',
      languages: [],
      otherLanguage: '',
      areas: [],
      availability: [],
      timeAvailability: []
    });

    const isFormValid = computed(() => {
      return (
        formData.value.fullName &&
        formData.value.email &&
        formData.value.birthdate &&
        formData.value.phone &&
        formData.value.ccNumber &&
        formData.value.nif &&
        formData.value.languages.length > 0 &&
        formData.value.areas.length > 0 &&
        formData.value.availability.length > 0 &&
        formData.value.timeAvailability.length > 0 &&
        (!customLanguageEnabled.value || formData.value.otherLanguage)
      );
    });
    
    const customLanguageEnabled = ref(false);

    onMounted(() => {
      flatpickr('#birthdate', {
        dateFormat: 'Y-m-d',
        onChange: (selectedDates, dateStr) => {
          formData.value.birthdate = dateStr;
        }
      });
    });

    watch(formData, () => {}, { deep: true });

    const handleSubmit = async () => {
      const data = { ...formData.value };

      // If custom language is enabled and the otherLanguage field is not empty
      if (customLanguageEnabled.value && formData.value.otherLanguage) {
        data.languages.push(formData.value.otherLanguage); // Add the custom language to the languages array
      }

      console.log(data);

      const jsonData = JSON.stringify(data);  

      try {
        const response = await fetch('http://localhost:8080', { // Include http:// for fetch URL
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
          },
          body: jsonData,
        });
        if (response.ok) {
          const result = await response.json();
          alert('Form submitted successfully!');
          resetForm();
          console.log(result);
        } else {
          console.error('Error:', response.statusText);
          resetForm();
        }
      } catch (error) {
        console.error('Network error:', error);
      }
    };
    
    const resetForm = () => {
      formData.value = {
        fullName: '',
        email: '',
        birthdate: '',
        phone: '',
        tshirtSize: '',
        ccNumber: '',
        nif: '',
        educationLevel: '',
        facebook: '',
        instagram: '',
        occupation: '',
        languages: [],
        otherLanguage: '',
        areas: [],
        availability: [],
        timeAvailability: [],
      };
      customLanguageEnabled.value = false; 
    };

    return {
      formData,
      customLanguageEnabled,
      handleSubmit,
      resetForm,
      isFormValid
    };
  },
});

</script>
