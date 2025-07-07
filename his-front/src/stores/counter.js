import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

export const useCounterStore = defineStore('counter', () => {
  const count = ref(0)
  let vo_user = ref({})
  const doubleCount = computed(() => count.value * 2)
  function increment() {
    count.value++
  }


  return {  vo_user, count, doubleCount, increment }
})
